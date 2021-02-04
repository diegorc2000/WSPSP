package entidad;

import java.util.Scanner;

public class Duelo {

	private Personaje p1;
	private Personaje p2;
	

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}
	
	public Personaje combatir() {

		Personaje pInicial = null;
		Personaje pFinal = null;
		Personaje pGanador = null;
		
		System.out.println("Bienvenidos al combate");
		System.out.println("Los luchadores de hoy son;");

		if (p1.getIniciativa() > p2.getIniciativa()) {
			pInicial = p1;
			pFinal = p2;
		} else {
			pInicial = p2;
			pFinal = p1;
		}
		
			boolean combateAcabado = false;

			do {
				pInicial.atacar(pFinal);
				
				if (pFinal.getPuntosVida() <= 0) {
					combateAcabado = true;
					pGanador = pInicial;
					System.out.println("Personaje " + pFinal.getNombre() + " a muerto");
				}else {
					pFinal.atacar(pInicial);
					if (pInicial.getPuntosVida() <= 0) {
						pGanador = pFinal;
						combateAcabado = true;
						System.out.println("Personaje" + pInicial.getNombre() + " a muerto");
					}
				}
				
				//CADA VEZ QUE PASE UN TURNO, PAUSO EL JUEGO
				System.out.println(pInicial);
				System.out.println(pFinal);
				
				Scanner sc = new Scanner(System.in);
				sc.nextLine();
			} while (!combateAcabado);
			
			return pGanador;
	

		
	}

	

}
