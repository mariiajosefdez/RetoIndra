package gestornotasestudiantes;

import java.util.Arrays;
import java.util.Scanner;

public class Clase {

	private double[] notas;

	private double max;
	private double min;
	private double media;

	static Scanner scanner = new Scanner(System.in);

	public Clase() {
		System.out.print("Ingrese la cantidad de estudiantes: ");
		int cantidad = scanner.nextInt();

		this.notas = new double[cantidad];

	}

	public Clase(int tamaño) {
		this.notas = new double[tamaño];
	}

	public void ingresarNotas() {
		for (int i = 0; i < this.notas.length; i++) {
			System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}

		calcularMedia();
		notaMaxima();
		notaMinima();

	}

	private double calcularMedia() {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}

		this.media = suma / notas.length;

		return this.media;
	}

	private double notaMaxima() {
		double max = notas[0];
		for (double nota : notas) {
			if (nota > max) {
				max = nota;
			}
		}

		this.max = max;

		return max;
	}

	private double notaMinima() {
		double min = notas[0];
		for (double nota : notas) {
			if (nota < min) {
				min = nota;
			}
		}

		this.min = min;

		return min;
	}

	public void mostrarResultados() {
		System.out.println("===   Resultados ===");
		System.out.println("= Nota media: " + media);
		System.out.println("= Nota más alta: " + max);
		System.out.println("= Nota más baja: " + min);
		System.out.println("=====================");
	}

	public double getMedia() {
		return this.media;
	}

	public double[] getNotas() {
		return notas;
	}

	/**
	 * Set de la variable notas
	 * 
	 * @author Maria Jose
	 * @param Array de notas tipo double
	 */

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

	public double getMax() {
		return max;
	}

	public double getMin() {
		return min;
	}

	public static Scanner getScanner() {
		return scanner;
	}

	public static void setScanner(Scanner scanner) {
		Clase.scanner = scanner;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Clase [notas=" + Arrays.toString(notas) + ", max=" + max + ", min=" + min + ", media=" + media + "]";
	}

}
