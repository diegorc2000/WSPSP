package com.restpersonas.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restpersonas.modelo.entidad.VideoJuego;
import com.restpersonas.modelo.persistencia.DaoVideoJuego;

//El objetivo de esta app es hacer un CRUD sencillo contra la entidad persona
//Un CRUD hablamos de las 4 operaciones básicas que podemos hacer contra
//una entidad
//C -> Create
//R -> Read
//U -> Update
//D -> Delete

//Mediante esta anotacion estamos dando de alta un objeto en nuestra aplicaion
//que es capaz de procesar y enviar mensajes HTTP
@RestController
public class ControladorVideoJuego {

	@Autowired
	private DaoVideoJuego daovideojuego;
	
	@GetMapping("juegos")
	public ResponseEntity<List<VideoJuego>> listar(){
		List<VideoJuego> lista = daovideojuego.listado();
		
		//Con un objeto de tipo ResponseEntity podemos devolver datos
		//y ademas codigos de respuesta
		ResponseEntity<List<VideoJuego>> re = 
				new ResponseEntity<List<VideoJuego>>(lista, HttpStatus.OK);
		
		return re;
	}
	
	//Cuando tenemos un parametro variable debemos de poner el nombre
	//de la variable entre corchetes, y lo recogemos con la anotacion
	//@PathVariable dentro de los argumentos de entrada del metodo
	@GetMapping("juegos/{id}")
	public ResponseEntity<VideoJuego> obtener(@PathVariable("id") int id_videoJuego){
		System.out.println("El id a buscar es: " + id_videoJuego);
		
		VideoJuego vj1 = daovideojuego.buscar(id_videoJuego);
		HttpStatus hs = null;
		if(vj1 != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = new ResponseEntity<VideoJuego>(vj1,hs);
		
		return re;
	}
	
	//Con la anotacion @RequestBodoy Spring va a intentar coger la informacion
	//que me ponga el cliente en el body del http y convertirlo a un objeto
	//de tipo personas
	@PostMapping("juegos")
	public ResponseEntity<VideoJuego> alta(@RequestBody VideoJuego vj) {
		VideoJuego vjAlta = daovideojuego.alta(vj);
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(vjAlta,HttpStatus.CREATED);
		return re;
	}
	
	//Para modificar usaremos el verbo PUT
	//recurso que vamos a mapear
	@PutMapping("juegos/{id}")
	public ResponseEntity<VideoJuego> modificar(@RequestBody VideoJuego vj,
			@PathVariable("id") int id_videoJuego){
		//Aqui me va venir el id por el parametro de URL y el resto
		//de la informacion a cambiar por el body
		//Asi pues le meto el id a la persona que me llega para juntarlos
		vj.setId(id_videoJuego);
		
		VideoJuego vjModificado = daovideojuego.modificar(vj);
		
		HttpStatus hs = null;
		if(vjModificado != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(vjModificado,hs);
		
		return re;
	}
	//Para borrar usaremos el metodoo DELETE
	@DeleteMapping("juegos/{id}")
	public ResponseEntity<VideoJuego> borrar(@PathVariable("id") int id_videoJuego){
		VideoJuego vj = daovideojuego.borrar(id_videoJuego);
		HttpStatus hs = null;
		if(vj != null) {
			hs = HttpStatus.OK;
		}else {
			hs = HttpStatus.NOT_FOUND;
		}
		
		ResponseEntity<VideoJuego> re = 
				new ResponseEntity<VideoJuego>(vj,hs);
		
		return re;
	}
}
