package examenGeometria;

import java.util.Arrays;

public class Circulo {
	private double radio;
	private int colorRGB[];
	
	public final static double PI = Math.PI;
	
	public static int contador = 0;
	
	
	public Circulo() {
		this.radio = 1;
		this.colorRGB = new int[3];
		
		contador ++;
	}
	
	public Circulo(double radio) {
		this.radio = radio;
		this.colorRGB = new int[3];
		
		contador ++;
	}
	
	public Circulo(Circulo otro) {
		this.radio = otro.radio;
		this.colorRGB = otro.colorRGB;
	}

	
	public double obtenerArea() {
		double area = PI * radio * radio;
		
		return area;
	}
	
	/**
	 * Hace eso
	 * 
	 * @return longitud del circulo
	 * 
	 * */
	
	public double obtenerLongitud() {
		double longitud = 2 * PI * this.radio;
		
		return longitud;
		
	}
	
	/**
	 * 
	 * Pues sire para hacerlo mas rgand
	 * 
	 * 
	 * @param porcentaje int
	 * @return void 
	 * */
	
	public void escalar(int porcentaje) {
		
		double porcentajeD = (double) porcentaje; 
		double escalado = (porcentajeD / 100) + 1;
		double resultado = this.radio * escalado;
		
		this.radio = resultado;
		
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	
	public double getRadio() {
		return this.radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", colorRGB=" + Arrays.toString(colorRGB) + "]";
	}
	
	public static void toString(Circulo circulo) {
		System.out.println("Radio: " + circulo.radio + ", colorRGB: " + Arrays.toString(circulo.colorRGB));
	}
	
	public static void agrandarTodos(Circulo[] array) {
		final int TAMAÑO = 20;
		
		
		for(Circulo circulo: array) {
			circulo.escalar(TAMAÑO);
		}
		
		
	}
	
	public double elipse() {
		double semieje = (obtenerArea()) / (PI * radio);
		
		double resultado = 2 * PI * Math.sqrt(((radio*radio) + (semieje * semieje) / 2));
		
		return resultado;
	}
	
	
}
