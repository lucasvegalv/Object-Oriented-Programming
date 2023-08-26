package ejercicio2b;

public class Utilidades2b {

	public static final double PI = Math.PI;
	
	public static double area(double radio) {
		
	if(radio < 0) {
		return -1;
	} else {
		double radioCirulo = PI * (radio * radio);
		return radioCirulo;	
	}
}

	public static double area(double x, double y) {
		if(x < 0 || y < 0) {
			return -1;
		} else {
			double area = x * y;
			return area;
		}
	}
	
	
}
