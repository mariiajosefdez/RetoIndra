package ejercicio8;

public class Letras {
	public static char obtenerChar(int codigo) {
		
		if (codigo > 126 || codigo < 33) {
			return '\\';
		}
		
		char caracter = (char) codigo;
		
		return caracter;
	}
	
	
	public static int obtenerCodigo(char car) {
		int codigo = (int) car;
		return codigo;
	}
	
	
	public static char aMay(char caracter) {
		
		String string = Character.toString(caracter);;
		
		if (string.toLowerCase() == string) {
			
			String mayuscula = string.toUpperCase();
			char car = mayuscula.charAt(0);
			
			return car;
		} else {
			return string.charAt(0);
		}
		
		
	}
	
	
	public static char aMin(char caracter) {
		
		String string = Character.toString(caracter);;
		
		if (string.toUpperCase() == string) {
			
			String mayuscula = string.toLowerCase();
			char car = mayuscula.charAt(0);
			
			return car;
		} else {
			return string.charAt(0);
		}
		
		
	}
	
}
