package aula15;

public class Retangulo {
	double altura, largura;

	public Retangulo(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public double area() {
		return altura * largura;
	}
	
	public double perimetro() {
		return (altura + largura) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(altura*altura + largura*largura);
	}
	
	public static String estatico() {
		return "Ola mundo";
	}
	
}
