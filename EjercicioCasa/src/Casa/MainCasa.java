package Casa;

import java.util.ArrayList;

public class MainCasa {

	public static void main(String[] args) {

		//CREAMOS LA DIRECCION
		Direccion direccionCasa = new Direccion();
		direccionCasa.setNombreVia("Dali");
		direccionCasa.setTipoVia("calle");
		direccionCasa.setCp("28860");
		direccionCasa.setNumero("21");
		
		//CREAMOS AL PROPIETARIO
		Persona propietario = new Persona();
		propietario.setDireccion(direccionCasa);
		propietario.setDni("05950812E");
		propietario.setEdad(20);
		propietario.setNombre("Diego");
		
		//CREAMOS LAS HABITACIONES
		Habitacion salon = new Habitacion();
		salon.setM2(35);
		salon.setTipoHabitacion("SALON");
		
		Habitacion cocina = new Habitacion();
		cocina.setM2(15);
		cocina.setTipoHabitacion("COCINA");
		
		//CREAMOS A LOS INQUILINOS
		Persona inquilino1 = new Persona();
		inquilino1.setNombre("Alvaro Rodriguez");
		inquilino1.setDni("05950812Q");
		inquilino1.setEdad(21);
		inquilino1.setDireccion(direccionCasa);
		
		Persona inquilino2 = new Persona();
		inquilino2.setNombre("Carolina Rodriguez");
		inquilino2.setDni("05950812H");
		inquilino2.setEdad(17);
		inquilino2.setDireccion(direccionCasa);

		//CREAMOS LA CASA
		Casa casa = new Casa();
		casa.setDireccion(direccionCasa);
		casa.setPrecio(1000);
		casa.setPropietario(propietario);
		
		//DECLARAMOS LAS HABITACIONES
		ArrayList<Habitacion> listaHabitaciones = new ArrayList<Habitacion>();
		listaHabitaciones.add(cocina);
		listaHabitaciones.add(salon);
		
		casa.setListaHabitaciones(listaHabitaciones);
		
		//DECLARAMOS A LOS INQUILINOS
		ArrayList<Persona> listaInquilinos = new ArrayList<Persona>();
		listaInquilinos.add(inquilino1);
		listaInquilinos.add(inquilino2);
		
		casa.setListaInquilinos(listaInquilinos);
		
		/*inquilino2.getDireccion().setNombreVia("Picaso");
		inquilino2.getDireccion().setNombreVia("Juarez");
		System.out.println(listaInquilinos.get(0).getDireccion().getNombreVia());*/
		
		
		System.out.println(casa);
		
	}

}
