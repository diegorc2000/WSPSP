package entidad;

import utils.Aleatorio;

public class Hechizo extends Arma{

	@Override
	public int usar() {
		
		int daño = Aleatorio.calcularNumero(getDañoMinimo(), getDañoMaximo());//PARA CALCULAR EL DAÑO DEL ARMA
		int magiaCaos = Aleatorio.calcularNumero(1, 100);
		if (magiaCaos <= 25) { //SI EL DAÑO ES MAÑOR A 25 EL DAÑO HACE EL DOBLE DE DAÑO
			System.out.println("Magia del CAOS !!!");
			daño *= 2; 
		}
		return daño;
	}

}
