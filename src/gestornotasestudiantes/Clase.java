package gestornotasestudiantes;

import java.util.Arrays;
import java.util.Scanner;

public class Clase {

	private double[] notas;

	private double max;
	private double min;
	private double media;

	static Scanner scanner = new Scanner(System.in);
	
	/**
     * Constructor que solicita al usuario la cantidad de estudiantes 
     * y crea un array de notas con ese tamaño.
     */
	public Clase() {
		System.out.print("Ingrese la cantidad de estudiantes: ");
		int cantidad = scanner.nextInt();

		this.notas = new double[cantidad];
		
	/**
	 * Constructor que inicializa el array de notas con un tamaño
	 * 
	 * @param tamaño Número de estudiantes en la clase
	 */	

	}

	public Clase(int tamaño) {
		this.notas = new double[tamaño];
		
		
	}

	/**
     * para ingresar las notas de los estudiantes
     * el usuario ingresa cada nota y las almacena en el array
     * y calculo la media, la maxima y minima de las notas
     */
	
	public void ingresarNotas() {
		for (int i = 0; i < this.notas.length; i++) {
			System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
			notas[i] = scanner.nextDouble();
		}

		calcularMedia();
		notaMaxima();
		notaMinima();

	}
	/**
     * calculo la media de las notas ingresadas
     * recorre todas las notas, sumándolas y dividiendo por el número total
     * 
     * @return la media de las notas de los estudiantes
     */

	private double calcularMedia() {
		double suma = 0;
		for (double nota : notas) {
			suma += nota;
		}

		this.media = suma / notas.length;

		return this.media;
	}
	
	/**
     * calculo la nota máxima de las notas ingresadas
     * Recorre todas las notas para encontrar la más alta
     * 
     * @return la nota máxima
     */
	
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

	/**
     * calculo la nota mínima de las notas ingresadas
     * recorre todas las notas para encontrar la más baja
     * 
     * @return La nota mínima
     */
	
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

	/**
     * Muestra los resultados de la media, la minima y la maxima de las notas
     * 
     */
	
	public void mostrarResultados() {
		System.out.println("===   Resultados ===");
		System.out.println("= Nota media: " + media);
		System.out.println("= Nota más alta: " + max);
		System.out.println("= Nota más baja: " + min);
		System.out.println("=====================");
	}

	/**
     * Obtiene la media
     * 
     * @return la media
	 * @author Maria Jose
     */
	
	public double getMedia() {
		return this.media;
	}


	/**
     * Obtiene el array de notas de los estudiantes
     * 
     * @return El array de notas
	 * @author Maria Jose
	 * 
     */
	
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

	/**
     * Obtiene la nota máxima registrada
     * 
     * @return la nota máxima de la clase
	 * @author Maria Jose
     */
	
	public double getMax() {
		return max;
	}

	/**
     * obtiene la nota mínima registrada
     * 
     * @return la nota mínima de la clase
	 * @author Maria Jose
     */
	
	public double getMin() {
		return min;
	}
	
	/**
     * Establece la media de las notas de la clase
     * 
     *
     */
	
	public void setMedia(double media) {
		this.media = media;
	}
	
	
	
	@Override
	public String toString() {
		return "Clase [notas=" + Arrays.toString(notas) + ", max=" + max + ", min=" + min + ", media=" + media + "]";
	}

}
