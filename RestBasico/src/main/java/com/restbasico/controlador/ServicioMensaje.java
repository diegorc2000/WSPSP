package com.restbasico.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restbasico.entidades.Videojuego;

@RestController
public class ServicioMensaje {
	
	@Autowired
	private Videojuego v1 = new Videojuego();
	
	@GetMapping("videojuego")
	private Videojuego videojuego() {
		return v1;
	}
	
	@PutMapping("modif")
	private String modificacion() {
		v1.setPrecio(v1.getPrecio() + 10);
		return "Modificación realizada";
	}
}
