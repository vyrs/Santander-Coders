package exercicio1;

public class Main {

	public static void main(String[] args) {
		Produto p1 = new Produto("arroz", 15, 20);
		
		System.out.println(p1.toString());
		System.out.println(p1.totalValorEstoque());
		
		p1.addProduto();
		
		System.out.println(p1.toString());
		System.out.println(p1.totalValorEstoque());

	}

}
