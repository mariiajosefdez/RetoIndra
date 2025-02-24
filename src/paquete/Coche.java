package paquete;

public class Coche {
	
	public String nombre;
	int velocidad;
	
	public Coche() {
		this.nombre = "Ejemplo";
	}
	
	public Coche(String nombre) {
		this.nombre = nombre;
	}
	
	public static int sumar(int a, int b) {
		return a+b;
	}
	
	public void pitar() {
		System.out.println("pi soy " + this.nombre);
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
