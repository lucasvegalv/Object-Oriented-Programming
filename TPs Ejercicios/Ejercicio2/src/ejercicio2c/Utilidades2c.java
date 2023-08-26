package ejercicio2c;

public class Utilidades2c {

	public static int saberCuantasLatas(double ancho, double altura, double areaPorLata, double latasExtra) {
		
		if((ancho <= 0 || altura <= 0 || areaPorLata <= 0) || latasExtra < 0) {
			return -1;
		} else {
			double areaPared = ancho * altura;
			int latasNecesarias = (int) Math.ceil(areaPared / areaPorLata);
			int numeroDeLatas = (int) (latasNecesarias - latasExtra);
			return numeroDeLatas;
		}
	}
	
	public static int saberCuantasLatas(double ancho, double altura, double areaPorLata) {
		
		if(ancho <= 0 || altura <= 0 || areaPorLata <= 0) {
			return -1;
		} else {
			double areaPared = ancho * altura;
			int latasNecesarias = (int) Math.ceil(areaPared / areaPorLata);
			return latasNecesarias;
		}	
	}
	
	public static int saberCuantasLatas(double area, double areaPorLata) {
		
		if(area <= 0 || areaPorLata <= 0) {
			return -1;
		} else {
			int latasNecesarias = (int) Math.ceil(area / areaPorLata);
			return latasNecesarias;
		}
	}
	
}
