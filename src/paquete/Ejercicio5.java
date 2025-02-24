package paquete;


import java.util.Scanner;

import javax.swing.JOptionPane;


public class Ejercicio5 {

	
	public static double calcular_radio(int area) {
		
		double division = area / Math.PI;
		
		double resultado = Math.sqrt(division);
		
		return resultado;
		
	}
	
	public static double calcularPerimetro (double radio) {
		
		double resultado = 2 * Math.PI *radio;
		
		return resultado;
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Mete el area");
		int area = sc.nextInt();
		
		
		double radio = calcular_radio(area);
		
		double perimetro = calcularPerimetro(radio);
		
		System.out.println("La longitud del brazo debe ser de " + radio + "m. y la valla tendrá " + perimetro + " m");

		System.out.printf("La longitud del brazo debe ser de %f m. y la valla tendrá %f m", radio, perimetro);
		
	}

}
