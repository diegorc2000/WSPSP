import java.util.Date;

public class PrimoRunnable implements Runnable {

	private int numero;

	public PrimoRunnable(int numero) {
		this.numero = numero;
	}

	@Override
	public void run() {
		
		Date inicio = new Date();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		System.out.println(esPrimo(numero) ? numero + " Es primo" : numero + " No es primo");
		
		Date fin = new Date();
		
		System.out.println("Tiempo de ejecuci�n en ms: " + (fin.getTime() - inicio.getTime()));

		System.out.println("---------------------------------------");

	}

	public boolean esPrimo(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	/*
	 * Instant start = Instant.now();
		
		System.out.println("---------------------------------------");
		
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		System.out.println(esPrimo(numero) ? numero + " Es primo" : numero + " No es primo");
		
		Instant end = Instant.now();
		
		System.out.println("Tiempo de ejecuci�n en ms: " + (Duration.between(start, end)));

		System.out.println("---------------------------------------");
	 */

}