package ejercicio2a;

public class Utilidades2a {

	public static final double KM_A_MILLA = 0.621;
	
	public static long aMillasPorHora (double kilometrosPorHora) {
	
	    // Validamos que el parametro sea positivo para poder realizar el calculo
	    if(kilometrosPorHora < 0) {
	      return -1;
	    } else {
	      long resultado = Math.round(kilometrosPorHora * KM_A_MILLA); // Redondeamos la conversion
	      return resultado;
	    }
	  }	
	
	public static void imprimirConversion (double kilometrosPorHora) {
		
		if(kilometrosPorHora < 0) {
			System.out.print("Valor no valido");
		} else {
			long respuestaEnMillas = Math.round(kilometrosPorHora * KM_A_MILLA); 
			System.out.print(kilometrosPorHora + "km/h = " + respuestaEnMillas + "mi/h");
		}
	}
	
}
