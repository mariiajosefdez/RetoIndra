package examenGeometria;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		// Test 1
		
		/*
		Circulo circulo1 = new Circulo(5);
		Circulo circulo2 = new Circulo();
		
		System.out.println("Area: "+circulo1.obtenerArea());
		System.out.println("Longitud: "+circulo1.obtenerLongitud());
		
		circulo1.escalar(10);
		
		System.out.println("Escalar: "+circulo1.getRadio());
		
		circulo1.setRadio(99);
		
		System.out.println("Radio: "+circulo1.getRadio());
		*/
		
		
		// Test 2
		
		Circulo[] circulosIguales = new Circulo[10];	
		Circulo[] circulosDiferentes = new Circulo[10];
	
		for (int i = 0; i< circulosIguales.length ;i++) {
			Circulo circuloProvisional = new Circulo(5);
			
			circulosIguales[i] = circuloProvisional;
			
			Circulo circuloProvisional2 = new Circulo(i);
			
			circulosDiferentes[i] = circuloProvisional2;
		}
		
		
		for (int i = 0; i < circulosDiferentes.length; i++) {
			System.out.println("Area:" + circulosDiferentes[i].obtenerArea());	
			System.out.println("Longitud:" + circulosDiferentes[i].obtenerLongitud());	
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		
		for(Circulo circulo: circulosIguales) {
			System.out.println("Area:" + circulo.obtenerArea());	
			System.out.println("Longitud:" + circulo.obtenerLongitud());
		}
		
		System.out.println("");
		System.out.println("");
		System.out.println("");
		
		System.out.println("Circulos: "+Circulo.contador);
		
		Circulo.agrandarTodos(circulosDiferentes);
		
		for(Circulo circulo: circulosDiferentes) {
			Circulo.toString(circulo);
		}
		
		
	}

}
