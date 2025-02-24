package paquete;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final int NUMERO = 9;
		final int INTENTOS= 3;
		
		int a=0;
		int intentos = INTENTOS;
				
		while (a != NUMERO && intentos>0) {
			a = sc.nextInt();
			intentos--;
		}
		
		if (a == NUMERO) {
			//JOptionPane.showConfirmDialog(null, "Has acertado");
			System.out.println("Has acertado");
			}else {
				System.out.println("Has fallado");
			}

	}

}
