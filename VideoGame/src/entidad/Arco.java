package entidad;

import utils.Aleatorio;

public class Arco extends Arma {

	@Override
	public int usar() {
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());//PARA CALCULAR EL DA�O DEL ARMA
		return da�o;
	}

}
