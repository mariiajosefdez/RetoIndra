package ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Dibujo.menu();
		
		int opcion = sc.nextInt();
		
		System.out.println("Introduce el tamaño");
		int tamaño = sc.nextInt();
		
		System.out.println("Introduce el caracter");
		sc.nextLine();
		
		String caracteres = sc.nextLine();
				
		char car = caracteres.charAt(0);
		
		switch (opcion) {
		case 1:
			Dibujo.pintarLinea(tamaño, car);
			break;
		case 2:
			Dibujo.pintarCuadrado(tamaño, car);
			break;
		case 3:
			System.out.println("Invertida = 1  Normal = 0");
			int orientacion = sc.nextInt();
			
			if (orientacion == 1) {
				Dibujo.pintarPiramide2(tamaño, car, true);
			} else if(orientacion == 0) {
				Dibujo.pintarPiramide2(tamaño, car, false);
			} else {
				Dibujo.pintarPiramide2(tamaño, car, false);
			}
			break;
		case 4:
			Dibujo.pintarRombo(tamaño, car);
			break;
		
		}
		
		
		

	}

}
