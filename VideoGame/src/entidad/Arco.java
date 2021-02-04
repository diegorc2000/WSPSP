package entidad;

import utils.Aleatorio;

public class Arco extends Arma {

	@Override
	public int usar() {
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());//PARA CALCULAR EL DAÑO DEL ARMA
		return daño;
	}

}
