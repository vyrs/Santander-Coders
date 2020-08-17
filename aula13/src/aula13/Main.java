package aula13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//int idade = 19;
		//String nome = "Rafael";
		
//		String dia;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Digite um dia da semana: ");
//		dia = sc.next();
//		if(dia.equals("domingo") || dia.equals("sabado")) {	
//			System.out.println("é final de semana!");
//		} else {
//			System.out.println("Não é final de semana!");
//		}
		
		int idade;
		String alfabetizado, cpf, rg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = sc.nextInt();
		System.out.println("Você é alfabetizado? (s/n): ");
		alfabetizado = sc.next();
		System.out.println("Você possui cpf? (s/n): ");
		cpf = sc.next();
		System.out.println("Você possui rg? (s/n): ");
		rg = sc.next();
	

		if(idade >= 18 && alfabetizado.equals("s") &&
				cpf.equals("s") && rg.equals("s")) {	
			System.out.println("Você pode dirigir!");
		} else {
			System.out.println("Você não pode dirigir!");
		}
		
		
		//  nextLine ou next  para pegar string
		// int[] notas = {5, 6, 7};
		// >, <, >=, <=, ==, !=
		// &&, ||, !
//		if( (idade >= 16) && (idade < 18) ) {
//			System.out.println(nome+" pode votar mas não é obrigatório!");
//		}else {
//			System.out.println(nome+" é menor de idade!");
//		}	
		
//		for(int i = 0; i <= 10; i++) {
//			System.out.println("8 x " + i + " = " + (8*i));	
//		}
		
//		int i = 0;
//		while(i < 10) {
//			i++;
//			System.out.println("8 x " + i + " = " + (8 * i));			
//		}
//		int op;
//		Scanner sc = new Scanner(System.in);
//		float num1 = 0, num2 = 0;
//		do {
//			
//			System.out.println("Escolha uma opção: ");
//						
//			System.out.println("1 - Somar ");
//			System.out.println("2 - Subtrair ");
//			System.out.println("3 - Multiplicar ");
//			System.out.println("4 - Dividir ");
//			System.out.println("5 - Sair ");
//			
//			op = sc.nextInt();
//			
//			if(op != 5) {
//				System.out.println("Digite um número: ");
//				num1 = sc.nextFloat();
//				System.out.println("Digite um número: ");
//				num2 = sc.nextFloat();	
//			}
//						
//			switch(op) {
//				case 1: somar(num1, num2);
//						break;
//				case 2: subtrair(num1, num2);
//						break;
//				case 3: multiplicar(num1, num2);
//						break;
//				case 4: dividir(num1, num2);
//						break;
//				case 5: System.out.println("Obrigado! Volte sempre!");
//						break;
//				default: System.out.println("Opção inválida!");
//			}
//			
//		}while(op != 5);
		

	}
	
	public static void dividir(float num1, float num2) {
		System.out.println("O resultado da operação é: "+ (num1/num2));		
	}
	public static void somar(float num1, float num2) {
		
		System.out.println("O resultado da operação é: "+ (num1 + num2));
		
	}
	
	public static void subtrair(float num1, float num2) {
		
		System.out.println("O resultado da operação é: "+ (num1 - num2));
		
	}
	public static void multiplicar(float num1, float num2) {
						
		System.out.println("O resultado da operação é: "+ (num1*num2));
		
	}
	
	

}
