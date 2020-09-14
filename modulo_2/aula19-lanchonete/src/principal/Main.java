package principal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lanchonete.Bolo;
import lanchonete.Massa;
import lanchonete.Sanduiche;
import lanchonete.TiposMassa;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("[1] Sanduíches\n[2] Massas\n[3] Bolos\n[4] Sair");
			op = sc.nextInt();
			switch(op) {
				case 1: menuSanduiche();
					break;
				case 2: menuMassa();
					break;
				case 3: menuBolo();
					break;
				case 4: System.out.println("Saindo...");
						break;
				default: System.out.println("Opção invalida!\n");
					break;
			}
		}while(op != 4);
		
		sc.close();
	}
		private static void menuSanduiche() {
			Scanner sc = new Scanner(System.in);
			List<String> ingredientes = new ArrayList<>();
			
			while(ingredientes.size() <= 10) {
				System.out.print("Digite um ingrediente: ");
				ingredientes.add( sc.nextLine() );
				System.out.println("Deseja adicionar outro ingrediente? (s/n)");
				char c = sc.next().charAt(0);
				sc.nextLine();
				if(c == 'n') {
					break;
				}				
			}
			
			Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
			
			System.out.println("Quantos km de distância da sua casa até a lanchonete?");
			double distancia = sc.nextDouble();
			
			System.out.println("Preço: "+sanduiche.getPreco()+" reais, Tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
			
		}
		
		private static void menuMassa() {
			Scanner sc = new Scanner(System.in);
			int op;
			while(true) {
				System.out.print("Qual é o tipo de massa? ([1] - Pizza, [2] - Macarrão ou [3] - Lasanha)");
				op = sc.nextInt();
				sc.nextLine();
				if(op != 1 && op != 2 && op != 3) {					
					System.out.println("Opção invalida, tente novamente!");
				} else break;	
			}
			
			System.out.println("Qual o molho?");
			String molho = sc.nextLine();
			
			TiposMassa tipo = null;
			if(op == 1) tipo = TiposMassa.PIZZA;
			if(op == 2) tipo = TiposMassa.MACARRAO;
			if(op == 3) tipo = TiposMassa.LASANHA;
			
			Massa massa = new Massa(45.00, molho, tipo);
			
			System.out.println("Quantos km de distância da sua casa até a lanchonete?");
			double distancia = sc.nextDouble();
		
			
			System.out.println("Tipo de Massa: " + massa.getTipo() + ", Preço: "+massa.getPreco()+" reais, Tempo para entrega: "+massa.tempo(distancia)+" minutos\n");
			
		}	
		
		private static void menuBolo() {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Qual a massa?");
			String massa = sc.nextLine();
			
			System.out.println("Qual o recheio?");
			String recheio = sc.nextLine();
			System.out.println("Qual a cobertura?");
			String cobertura = sc.nextLine();
			
			
			Bolo bolo = new Bolo(30.00, massa, recheio, cobertura);
			
			System.out.println("Quantos km de distância da sua casa até a lanchonete?");
			double distancia = sc.nextDouble();
		
			
			System.out.println("Preço: "+bolo.getPreco()+" reais, Tempo para entrega: "+bolo.tempo(distancia)+" minutos\n");
			
		}
	
	
	
}