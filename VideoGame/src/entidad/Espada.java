package entidad;

import utils.Aleatorio;

public class Espada extends Arma{//UNA ESPADA ES UN ARMA ENTONCES PONEMOS EL EXTEND DE ARMA

	@Override
	public int usar() {
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());//PARA CALCULAR EL DA�O DEL ARMA
		return da�o;
	}

}
