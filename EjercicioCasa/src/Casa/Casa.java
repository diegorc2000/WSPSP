package Casa;

import java.util.ArrayList;

public class Casa {

	private double precio;
	private Persona propietario;
	private Direccion direccion;
	private ArrayList<Habitacion> listaHabitaciones;
	private ArrayList<Persona> listaInquilinos;

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Persona getPropietario() {
		return propietario;
	}

	public void setPropietario(Persona propietario) {
		this.propietario = propietario;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Habitacion> getListaHabitaciones() {
		return listaHabitaciones;
	}

	public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
		this.listaHabitaciones = listaHabitaciones;
	}

	public ArrayList<Persona> getListaInquilinos() {
		return listaInquilinos;
	}

	public void setListaInquilinos(ArrayList<Persona> listaInquilinos) {
		this.listaInquilinos = listaInquilinos;
	}

	@Override
	public String toString() {
		return "Casa " + precio + "\nPropietario=" + propietario + "\n" + direccion
				+ "\nListaHabitaciones; " + listaHabitaciones + "\nListaInquilinos=" + listaInquilinos ;
	}
	
	//para calcular los metros cuadrados
	public double calcularM2() {
		int m2totales = 0;
		
		for (Habitacion h : listaHabitaciones) {
			m2totales += h.getM2();
		}
		return m2totales;
	}

}
