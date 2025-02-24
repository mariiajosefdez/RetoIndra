package ejercicio7;

import java.util.List;

public class Calculador {

	
	public static long factorial (int numero) {
		if(numero<=1) {
			return 1;
			
		}
		
		long resultado = 1;
		
		for(int i = numero; i>1; i--) {
			resultado *= i;
		}
		
		return resultado;
	}
	
	
	public static boolean esPrimo(int numero) {
		
		for (int i = numero - 1; i > 1; i--) {
			if (numero % i == 0) {
				return false;
			}
		}
		
		return true;
		
	}
	
	
	public static int terminoFibo(int posicion) {
		if (posicion <= 2) {
			return 1;
		}
		
		int a = 1;
		int b = 1;
		int aux = 0;
		
		
		for (int i = 2; i < posicion; i++) {
			aux = a + b;
			a = b;
			b = aux;
		}
		
		
		
		return aux;
	}
	
	public static int mcd(int a, int b) {
		
	
		
		return array[0];
	}

}
