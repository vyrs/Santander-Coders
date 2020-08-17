package exercicio1;

public class Produto {
  String nome;
  double preco;
  int quantidade;
  
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
	}
	
	public double totalValorEstoque() {
		return preco * quantidade;
	}
	
	public void addProduto() {
		quantidade++;
	}
  
	public void removeProduto() {
		quantidade--;
	}
  
}
