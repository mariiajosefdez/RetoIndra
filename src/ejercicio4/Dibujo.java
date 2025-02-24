package ejercicio4;

public class Dibujo {
	
	public static void pintarLinea(int num, char car) {
		for (int i = 0; i<num; i++) {
			System.out.print(car + " ");
		}
		System.out.println("");
	}
	
	public static void pintarCuadrado(int tamaño, char car) {
		for (int i = 0; i<tamaño; i++) {
			pintarLinea(tamaño, car);
		}
	}
	
	public static void pintarPiramide(int tamaño, char car) {
		for (int i = 1; i<=tamaño; i++) {
			pintarLinea(i, car);
		}
	}
	
	public static void pintarPiramideInvertida(int tamaño, char car) {
		for (int i = tamaño; i > 0; i--) {
			pintarLinea(i,car);
		}
	}
	
	
	public static void pintarPiramide2(int tamaño, char car, boolean invertida) {
		
		if (invertida) {
			pintarPiramideInvertida(tamaño, car);
		} else {
			pintarPiramide(tamaño, car);
		}
		
	}
	
	public static void pintarRombo(int tamaño, char car) {
		
		pintarPiramide(tamaño-1, car);
		
		pintarPiramideInvertida(tamaño,car);
		
	}
	
	public static void menu() {
		System.out.println("------------------------");
		System.out.println("- opción (1) Linea     -");
		System.out.println("- opción (2) Cuadrado  -");
		System.out.println("- opción (3) Piramide  -");
		System.out.println("- opción (4) Rombo     -");
		System.out.println("------------------------");
	}
	
	
	
	
	
}
