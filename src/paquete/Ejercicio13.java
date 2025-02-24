package paquete;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int mes = sc.nextInt();	
		
		switch(mes) {
		
			case 1:
				System.out.println("Es enero");
				break;
	
			case 2:
				System.out.println("Es febrero");
				break;
				
			case 3:
				System.out.println("Es marzo");
				break;	
			case 4:
				System.out.println("Es abril");
				break;
				
			default:
				System.out.println("Mes " + mes + " no existe");
				
		
		}
	
	
	}

}
