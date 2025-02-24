package ejercicio6;

import java.util.Scanner;

public class Lectura {
	
	public static int leeNumPositivo() {
		Scanner sc = new Scanner(System.in);
		
		int numero = -1;
		
		while (numero < 0) {
			System.out.println("Introduce un numero positivo");
			numero = sc.nextInt();
		}
		
		return numero;
	}
	
	public static boolean esVocal(String car) {
		char[] vocales = {'a', 'e', 'i', 'o', 'u'};
	
		
		for (int i = 0; i < vocales.length; i++) {
			if (car.charAt(0) == vocales[i]) {
				return true;
			}
		}
		return false;
	}
	
	public static char leeVocal() {
		

		
		Scanner sc = new Scanner(System.in);
		String entrada = "bb";
		
		
		
		
		while (entrada.length() > 1 || !(esVocal(entrada))) {
			System.out.println("Introduce una volcal");
			entrada = sc.nextLine();
		}
		
		

		char retorno = entrada.charAt(0);
		
		
		return retorno;
	}
	
	public static int leeNumRango(int minimo, int maximo) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean primero = true;
		int numero = -1;
		
		
		while (primero || !(numero >= minimo && numero <= maximo)) {
			primero = false;
			
			System.out.println("Introduce el numero entre "+minimo+" y "+maximo);
			numero = sc.nextInt();
			
		}
		
		return numero;
		
	}
	
}
