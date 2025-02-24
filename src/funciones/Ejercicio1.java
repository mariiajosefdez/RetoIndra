package funciones;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ejercicio1 {

	public static int redondea(double numero) {
		int resultado;
		int parteEntera = (int) numero;
		double parteDecimal = numero - parteEntera;
		if (parteDecimal >= 0.50) {
			resultado = parteEntera + 1;
		} else {
			resultado = parteEntera;
		}
		return resultado;
	} // Fin método

	public static int potencia(int base, int exponente) {
		int contador = base;
		for (int i = 0; i < exponente - 1; i++) {
			contador = contador * base;
		}
		
		return contador;
	}
	
	
	public static int ContarNumero (int numero) {
		String numeroString = Integer.toString(numero);
		
		int tamaño = numeroString.length();
		
		return tamaño;
	}
	
	public static void mostrarPotencia() {
		 
		for (int i=1; i<101; i++) {
			
			int cuadrado=potencia(i,2);
			int cubo=potencia(i,3);
			
			System.out.println (i+"   " + cuadrado+"   "+ cubo);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*System.out.println("base");
		int base = sc.nextInt();

		System.out.println("exponente");
		int exponente = sc.nextInt();
		
		
		// JOptionPane.showMessageDialog(null, Integer.toString(potencia(base,exponente)) );

		mostrarPotencia();
		
		System.out.println("acabo");*/
		
		
		//ej3
		
		int a =0;
		a=sc.nextInt();
		
		int resultado = ContarNumero(a);
		
		JOptionPane.showMessageDialog(null, resultado);
		

	}

}
