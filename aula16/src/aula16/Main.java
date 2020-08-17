package aula16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double depositoInicial;
		String nome;
		
		System.out.println("Digite o numero da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Digite o nome do correntista: ");
		sc.nextLine();
		nome = sc.nextLine();
		
		Conta cb = new Conta(numeroConta, nome);
		
		System.out.println("Gostaria de fazer um deposito inicial? (S/N) ");
		char opt = sc.nextLine().toLowerCase().charAt(0);
		
		if (opt == 's') {
			System.out.println("Digite o valor do deposito inicial: ");
			depositoInicial = sc.nextDouble();
			cb.deposito(depositoInicial);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Digite o valor do deposito: ");
		double deposito = sc.nextDouble();
		cb.deposito(deposito);
		System.out.println("Dados atualizados: ");
		System.out.println(cb);
		
		System.out.println();
		System.out.println("Digite o valor do saque: ");
		double saque = sc.nextDouble();
		cb.saque(saque);
		System.out.println("Dados atualizados: ");       
		System.out.println(cb);
		sc.close();
		
	}

}
