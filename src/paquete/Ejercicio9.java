package paquete;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		int numeroMaximo;
		
		numeroMaximo=sc.nextInt();
		
		int a, b, suma, temporal;
		
		suma = 2;
		a=1;
		b=1;
		
		System.out.print("1 1 ");
		while (suma<numeroMaximo) {
			suma=a+b;
			
			if (suma < numeroMaximo) {
				System.out.print(suma + " ");	
			}
			
			
			a = b;
			b = suma;
			
			
		}
		
		
	}

}
