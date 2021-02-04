package entidad;

import utils.Aleatorio;

public class Hechizo extends Arma{

	@Override
	public int usar() {
		
		int da�o = Aleatorio.calcularNumero(getDa�oMinimo(), getDa�oMaximo());//PARA CALCULAR EL DA�O DEL ARMA
		int magiaCaos = Aleatorio.calcularNumero(1, 100);
		if (magiaCaos <= 25) { //SI EL DA�O ES MA�OR A 25 EL DA�O HACE EL DOBLE DE DA�O
			System.out.println("Magia del CAOS !!!");
			da�o *= 2; 
		}
		return da�o;
	}

}
