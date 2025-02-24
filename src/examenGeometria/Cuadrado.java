package examenGeometria;

public class Cuadrado {
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}
	
	public Cuadrado(Cuadrado cuadrado){
		this.lado= cuadrado.lado;
	}
	
	/**
	 * dado un lado establece el lado del objeto
	 * @param lado
	 */
	public void setLado (double lado) {
		this.lado = lado;
	}
	 /**
	  * retorna el lado del objeto
	  * @return lado del objeto
	  */
	public double getLado () {
		return this.lado;

	}
	
	public double ObtenerArea () {
		
		double area= lado * lado;
		
		return area;
		
		
	}
	
	public double ObtenerPerimetro () {
		double Perimetro = lado * 4;
		return Perimetro;
	}
	
	public void Escalar(int Porcentaje) {
		double PorcentajeD = (double) Porcentaje;
		
		double multip= (PorcentajeD /100) +1;
		double resultado= this.lado * multip;
		
		this.lado = resultado;
		
		
	}
	
	public static void PintarLinea(double Tamaño) {
		for (double i =0; i < Tamaño ; i++){
			System.out.print ("* ");
		}
		System.out.println("");
	}
	
	

	
	public void Dibujar() {
		for(int i=0; i< lado; i++) {
			PintarLinea(lado);
		}
	}
	
	

}



