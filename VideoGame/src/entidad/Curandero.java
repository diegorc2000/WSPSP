package entidad;

public class Curandero extends Personaje{
	private int sabiduria;
	
	@Override
	public void atacar(Personaje p) {
		System.out.println("AVE MARIA PURISIMA !!");
		int daño = getArma().usar();
		if (getArma() instanceof Rezo) {
			daño += sabiduria;
		}
		p.setPuntosVida(p.getPuntosVida() - daño);
		System.out.println(this.getNombre() + "hace un daño de; " + daño);
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	
}
