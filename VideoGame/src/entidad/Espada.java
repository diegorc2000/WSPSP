package entidad;

import utils.Aleatorio;

public class Espada extends Arma{//UNA ESPADA ES UN ARMA ENTONCES PONEMOS EL EXTEND DE ARMA

	@Override
	public int usar() {
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());//PARA CALCULAR EL DAÑO DEL ARMA
		return daño;
	}

}
