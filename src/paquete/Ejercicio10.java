package paquete;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			
			int numero;
			
			int contador = 1;
			
			int acumulador = 1;
			
			numero= sc.nextInt();
			
			for (int i=1; i<=numero; i++) {
				acumulador= acumulador* i;
			}
			
			System.out.println(acumulador);
			
			acumulador = 1;
			
			while (contador <= numero) {
				acumulador= acumulador* contador;
				contador ++;
			}
			System.out.println(acumulador);
			

	}

}
