package Casa;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private Direccion direccion;

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public String getDni() {
		return dni;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Persona; nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", direccion=" + direccion + "\n";
	}

	
}
