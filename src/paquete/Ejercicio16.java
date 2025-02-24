package paquete;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura = sc.nextInt();
		
		for(int i = 0; i<=altura; i++) {
			
			for (int j = 0; j < altura - i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}

	}

}
