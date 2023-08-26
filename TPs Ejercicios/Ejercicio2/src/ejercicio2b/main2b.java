package ejercicio2b;

public class main2b {

	public static void main(String[] args) {
		
		double rectanguloEjemplo = Utilidades2b.area(3.4, 2.2);
		double ciruloEjemplo = Utilidades2b.area(3.2);
		double cuadradoEjemplo = Utilidades2b.area(2.5, 2.5);
		double ciruloInvalido = Utilidades2b.area(-5);
		double cuadradoInvalido = Utilidades2b.area(6, -3);

		System.out.print("El area del rectangulo es: " + rectanguloEjemplo);
		System.out.print("El radio del circulo es: " + ciruloEjemplo);
		System.out.print("El area del cuadrado es: " + cuadradoEjemplo);
		System.out.print("El area del circulo invalido es: " + ciruloInvalido);
		System.out.print("El area del cuadrado es: " + cuadradoInvalido);
	}

}
