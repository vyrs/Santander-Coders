package aula15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		double largura, altura;
		Scanner sc = new Scanner(System.in);
//		Funcionario f1 = new Funcionario("Joao Silva", 6000, 1000);
//		System.out.println(f1.toString());
//		System.out.println(f1.aumento(10));
//		System.out.println("Qual a largura do retangulo:");
//		largura = sc.nextDouble();
//		System.out.println("Qual a altura do retangulo:");
//		altura = sc.nextDouble();
//		
//		Retangulo r1 = new Retangulo(altura, largura);
//		System.out.println("área: " + r1.area());
//		System.out.println("Perimetro: " + r1.perimetro());
//		System.out.println("Diagonal: " + r1.diagonal());
		
//		String nome;
//		double n1, n2, n3;
//		
//		System.out.println("Nome do aluno: ");
//		nome = sc.nextLine();
//		
//		System.out.println("Nota 1: ");
//		n1 = sc.nextDouble();
//		
//		System.out.println("Nota 2: ");
//		n2 = sc.nextDouble();
//		
//		System.out.println("Nota 3: ");
//		n3 = sc.nextDouble();
//		
//		Aluno a1 = new Aluno();
//		double nota = a1.resultado(n1, n2, n3);
//		
//		System.out.println("Nota Final: " + nota);
//		if(nota >= 60) System.out.println("Passou");
//		else {
//			System.out.println("Não passou, faltou " + (60-nota) + " pontos");
//		}
//		
//		System.out.println(Circulo.volume(5));
		
		double preco, quantidade;
		System.out.println("Qual o preço do dolar? ");
		preco = sc.nextDouble();
		
		System.out.println("Quantos dolares você precisa? ");
		quantidade = sc.nextDouble();
		
		System.out.println("Quantidade em reais que você precisa: " + Dolar.conversao(preco, quantidade));
		
	}

}
