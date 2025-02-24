package paquete;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int a, b, c, mayor;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if(a != b && a != c && b != c) {
			mayor = a;
			
			if (b > mayor) {
				mayor = b;
			}
			
			if (c > mayor) {
				mayor = c;
			}
			
			System.out.print(mayor);
		} else {
			System.out.print("Algunos son iguales");
		}
		

		
		
		
		
		
		
		
		

	}

}
