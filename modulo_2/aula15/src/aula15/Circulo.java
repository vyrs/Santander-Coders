package aula15;

public class Circulo {
//	Constate:
	public static final double PI = 3.1415; 
	
	public static double circunferencia(double raio) {
		return 2 * PI * raio;
	}
	
	public static double volume(double raio) {
		return (4/3) * PI * Math.pow(raio, 3);
	}
}

