package entidad;

import utils.Aleatorio;

public class Rezo extends Arma {
	private int curacionObjeto;

	@Override
	public int usar() {
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());// PARA CALCULAR EL DA�O DEL ARMA
		int padreNuestro = Aleatorio.calcularNumero(1, 100);
		if (padreNuestro <= 50) { // SI EL DA�O ES MA�OR A 25 EL DA�O HACE EL DOBLE DE DA�O
			System.out.println("Padre nuestro que estas en os cielos...!!!");
			int curacion = da�o * (da�o * curacionObjeto);
			System.out.println("Me curo " + curacion);
			int puntosVidaActuales = this.getPersonaje().getPuntosVida();
			this.getPersonaje().setPuntosVida(puntosVidaActuales + curacion);// EL 50% DEL DA�O QUE INFLIJE EL REZO CURA
																				// LA VIDA DEL PERSONAJE
		}
		return da�o;
	}

}
