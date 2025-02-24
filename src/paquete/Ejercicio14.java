package paquete;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int mes=0;
		
		while(mes <1 || mes >12) {
			mes= sc.nextInt();
			
			if(mes <1 || mes >12) {
				System.out.println ("No es valido");
			}
			
		}
		
		
		switch (mes) {
		case 2:
			System.out.println("Tiene 28 dias");
			break;
			
		case 1: case 3: case 5:  case 7: case 8: case 10: case 12:
			System.out.println ("Tiene 31 dias");
			break;
			
		default:
			System.out.println ("Tiene 30dias");
			break;
			
		
		}
		

	}

}
