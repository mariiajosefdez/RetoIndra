package paquete;

import java.util.Scanner;


public class Ejercicio17 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		
		for (int i = 0; i <= altura -1 ; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
		
		for(int i = 0; i<=altura; i++) {
			
			for (int j = 0; j < altura - i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
