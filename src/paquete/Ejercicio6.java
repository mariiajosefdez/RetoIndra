package paquete;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int contador, numero_maximo, numero;
		
		contador=0;
		
		numero=1;
		
		numero_maximo = sc.nextInt();
		
		while (numero < numero_maximo) {
			System.out.println(numero);
			
			contador=contador+1;
			//contador++;
			
			numero= numero+3;
			
		}

		System.out.println(numero);
		System.out.println("---");
		System.out.println("Total: " + contador);
		
		
		
	}

}
