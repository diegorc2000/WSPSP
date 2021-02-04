public class Main {
	
	public static void main(String[] args) {
		
		PrimoRunnable hilo1 = new PrimoRunnable(5);
		Thread t1 = new Thread(hilo1);
		t1.setName("Hilo1");
		
		PrimoRunnable hilo2 = new PrimoRunnable(15);
		Thread t2 = new Thread(hilo2);
		t2.setName("Hilo2");
		
		PrimoRunnable hilo3 = new PrimoRunnable(656601);
		Thread t3 = new Thread(hilo3);
		t3.setName("Hilo3");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();
	}
}