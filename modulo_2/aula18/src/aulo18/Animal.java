package aulo18;

public class Animal {
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar() {
		System.out.println("Estou falando...");
	}
}
