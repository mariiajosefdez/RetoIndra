package paquete;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner (System.in);
		
		int largo = sc.nextInt();
		
		int fila= 0;
		int contador=0;
		
		
		while(fila<largo) {
			while(contador< largo) {
				System.out.print("* ");
				contador++;
			}
			contador = 0;
			fila++;
			
			System.out.println("");
		}
		
	}

}
