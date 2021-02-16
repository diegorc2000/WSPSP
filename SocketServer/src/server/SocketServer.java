package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {
	
	public static final int PUERTO = 2017;
	public static final String IP_SERVER = "localhost";
	
	public static void main(String[] args) {
		System.out.println("		APLICACIÓN SERVIDOR");
		System.out.println("---------------------------------------");
		
		ServerSocket servidorSocket = null;
		Socket socketConexion = null;
		
		PrintStream salida = null;
		InputStreamReader entrada = null;
		
		try {
			servidorSocket = new ServerSocket();
			InetSocketAddress direccion = new InetSocketAddress(IP_SERVER, PUERTO);
			servidorSocket.bind(direccion);
			
			while (true) {
				System.out.println("SERVIDOR: Esperando petición...");
				socketConexion = servidorSocket.accept();
				
				entrada = new InputStreamReader(socketConexion.getInputStream());
				BufferedReader bf = new BufferedReader(entrada);
				
				String stringRecibido = bf.readLine();
				
				System.out.println("SERVIDOR: Me ha llegado del cliente: " + stringRecibido);
				
				String[] operadores = stringRecibido.split("-");
				int numero1 = Integer.parseInt(operadores[0]);
				int numero2 = Integer.parseInt(operadores[1]);
				int operacion = Integer.parseInt(operadores[2]);
				int res = 0;
				
				switch (operacion) {
				case 1:
					res = numero1 + numero2;					
					break;
					
				case 2:
					res = numero1 - numero2;					
					break;

				case 3:
					res = numero1 * numero2;
					break;
				
				case 4:
					res = numero1 / numero2;
					break;
					
				default:
					break;
				}			
				
				salida = new PrintStream(socketConexion.getOutputStream());
				salida.println(res);
				
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (salida != null && entrada != null) {
					salida.close();
					entrada.close();
					socketConexion.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		
	}
}