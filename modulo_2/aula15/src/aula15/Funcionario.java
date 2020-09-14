package aula15;

public class Funcionario {
	String name;
	double salario, taxa;
	
	public Funcionario(String name, double salario, double taxa) {
		super();
		this.name = name;
		this.salario = salario;
		this.taxa = taxa;
	}

	@Override
	public String toString() {
		return "Funcionario [name=" + name + ", salario liquido=" + (salario-taxa) + "]";
	}
	
	public String aumento(double aumento) {
		salario = salario + (salario * (aumento/100));
		return "Atualizado: [name=" + name + ", salario liquido=" + (salario-taxa) + "]";
		
	}
	
	
}
