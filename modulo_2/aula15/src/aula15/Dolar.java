package aula15;

public class Dolar {
	public static double conversao(double preco, double quantidade) {
		return preco * (quantidade + quantidade * 0.06);
	}
}
