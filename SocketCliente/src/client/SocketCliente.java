package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class SocketCliente {

	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("		APLICACIÓN CLIENTE");
		System.out.println("---------------------------------------");
		
		String opcion = "";
		
		do {
			System.out.println("Continuar con la operación? Si/No");
			opcion = sc.nextLine();
			
			if (opcion.equals("si")) {

				Socket socketCliente = null;
				InputStreamReader entrada = null;
				PrintStream salida = null;

				InetSocketAddress direccionServidor = new InetSocketAddress(IP_SERVER, PUERTO);

				try {
					socketCliente = new Socket();
					socketCliente.connect(direccionServidor);
					System.out.println("Conexión establecida... a " + IP_SERVER + " por el puerto " + PUERTO);

					entrada = new InputStreamReader(socketCliente.getInputStream());
					salida = new PrintStream(socketCliente.getOutputStream());

					System.out.println("Introduzca los dos números: ");
					String numero1 = sc.nextLine();
					String numero2 = sc.nextLine();
					System.out.println("Introduce la operación: (1: Sumar, 2: Restar, 3: Multiplicar, 4: Dividir)");
					String operacion = sc.nextLine();

					String operandos = numero1 + "-" + numero2 + "-" + operacion;
					salida.println(operandos);

					BufferedReader bf = new BufferedReader(entrada);

					String resultado = bf.readLine();

					System.out.println("CLIENTE: " + resultado);

				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} while (opcion.equals("si"));
	}
}