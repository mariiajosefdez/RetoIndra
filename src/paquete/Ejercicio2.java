package paquete;

import java.util.Scanner;

import javax.swing.JOptionPane;

import java.lang.Math;

public class Ejercicio2 {

	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
		
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Mete el numero");
		
		// Scaner
		// int numero = sc.nextInt();
		
		//JOptionPane
		String entrada = JOptionPane.showInputDialog("Mete el numero");
		
		int numero = Integer.parseInt(entrada);
		
		int resto = numero % 2;
		
		if (resto == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		
		

		
	}

}
