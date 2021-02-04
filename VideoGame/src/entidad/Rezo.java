package entidad;

import utils.Aleatorio;

public class Rezo extends Arma {
	private int curacionObjeto;

	@Override
	public int usar() {
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());// PARA CALCULAR EL DAÑO DEL ARMA
		int padreNuestro = Aleatorio.calcularNumero(1, 100);
		if (padreNuestro <= 50) { // SI EL DAÑO ES MAÑOR A 25 EL DAÑO HACE EL DOBLE DE DAÑO
			System.out.println("Padre nuestro que estas en os cielos...!!!");
			int curacion = daño * (daño * curacionObjeto);
			System.out.println("Me curo " + curacion);
			int puntosVidaActuales = this.getPersonaje().getPuntosVida();
			this.getPersonaje().setPuntosVida(puntosVidaActuales + curacion);// EL 50% DEL DAÑO QUE INFLIJE EL REZO CURA
																				// LA VIDA DEL PERSONAJE
		}
		return daño;
	}

}
