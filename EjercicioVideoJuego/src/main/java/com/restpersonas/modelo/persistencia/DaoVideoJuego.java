package com.restpersonas.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restpersonas.modelo.entidad.VideoJuego;

//El concepto de DAO representa una clase que sirve de conexion de nuestra
//app con el modelo de datos (bbdd, ficheros, si tenemos los objetos levantados
//en memoria)

@Component
public class DaoVideoJuego {
	private List<VideoJuego> listaVideoJuego;
	private int contador = 0;
	
	
	public DaoVideoJuego() {
		VideoJuego vj1 = new VideoJuego();
		vj1.setId(contador++);
		vj1.setNombre("Minecraft");
		vj1.setCompañia("Mojang");
		vj1.setPrecio(19.99);
		vj1.setPuntuacion(9);
		
		VideoJuego vj2 = new VideoJuego();
		vj2.setId(contador++);
		vj2.setNombre("GTA V");
		vj2.setCompañia("ROCKSTAR GAMES");
		vj2.setPrecio(60);
		vj2.setPuntuacion(10);
		
		VideoJuego vj3 = new VideoJuego();
		vj3.setId(contador++);
		vj3.setNombre("Fortnite");
		vj3.setCompañia("EPIC GAMES");
		vj3.setPrecio(0);
		vj3.setPuntuacion(7);
		
		listaVideoJuego = new ArrayList<VideoJuego>();
		listaVideoJuego.add(vj1);
		listaVideoJuego.add(vj2);
		listaVideoJuego.add(vj3);
		
	}
	
	//Tendriamos que hacer los metodos de get, post, put, delete
	public List<VideoJuego> listado(){
		return listaVideoJuego;
	}
	
	// Para documentar por javadoc, ponemos /** y pulsamos enter
	
	/**
	 * Metodo que busca una persona por un id
	 * @param id representa el id a buscar
	 * @return la Persona con el id a buscar o null en caso de que la persona
	 * no exista
	 */
	public VideoJuego buscar(int id) {
		VideoJuego juego = null;
		for(VideoJuego vj : listaVideoJuego) {
			if(vj.getId() == id) {
				juego = vj;
				break;
			}
		}
		
		return juego;
	}
	
	public VideoJuego alta(VideoJuego vj) {
		vj.setId(contador++);
		listaVideoJuego.add(vj);
		return vj;
	}
	
	/**
	 * Metodo que modifica una persona a partir de un ID
	 * @param pModificar la persona que queremos modificar, dentro del atributo
	 * id contendra el id que queremos modificar
	 * @return Persona modificada o null en caso de que no encontremos el id
	 * de la persona
	 */
	public VideoJuego modificar(VideoJuego vjModificar) {
		VideoJuego vj = buscar(vjModificar.getId());
		if(vj != null) {
			vj.setNombre(vjModificar.getNombre());
			vj.setPrecio(vjModificar.getPrecio());
		}		
		return vj;
	}
	
	public VideoJuego borrar(int id) {
		VideoJuego vj = buscar(id);
		if(vj != null) {
			listaVideoJuego.remove(id);
		}
		return vj;
	}
}
