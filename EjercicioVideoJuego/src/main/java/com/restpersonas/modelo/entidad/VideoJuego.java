package com.restpersonas.modelo.entidad;

public class VideoJuego {
	private int id;
	private String nombre;
	private String compañia;
	private double precio;
	private double puntuacion;
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public double getPrecio() {
		return precio;
	}
	public double getPuntuacion() {
		return puntuacion;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public void setPuntuacion(double puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	@Override
	public String toString() {
		return "VideoJuego id=" + id + ", nombre=" + nombre + ", compañia=" + compañia + ", precio=" + precio
				+ ", puntuacion=" + puntuacion;
	}
	
	
}
