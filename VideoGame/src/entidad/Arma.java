package entidad;

public abstract class Arma {

	private int da�oMinimo;
	private int da�oMaximo;
	private String tipo;
	private Personaje personaje;

	public abstract int usar();

	public Personaje getPersonaje() {
		return personaje;
	}

	public void setPersonaje(Personaje personaje) {
		this.personaje = personaje;
	}

	public int getDa�oMinimo() {
		return da�oMinimo;
	}

	public void setDa�oMinimo(int da�oMinimo) {
		this.da�oMinimo = da�oMinimo;
	}

	public int getDa�oMaximo() {
		return da�oMaximo;
	}

	public void setDa�oMaximo(int da�oMaximo) {
		this.da�oMaximo = da�oMaximo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Arma [da�oMinimo=" + da�oMinimo + ", da�oMaximo=" + da�oMaximo + ", tipo=" + tipo + ", personaje="
				+ personaje.getNombre() + "]";
	}
	
	
}
