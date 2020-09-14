package aula17;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	static List<Contact> contacts = new ArrayList<Contact>();
	
	static int age, id, number, oper;
	static String name, phone, street, burgh, city , state;
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
	
		funcaoPrincipal();
	}
	
	static public void funcaoPrincipal() {
		
		do {
			System.out.printf("**** Menu Principal *****\n");
			System.out.printf("[ 1 ] Incluir Contato\n");
			System.out.printf("[ 2 ] Excluir Contato\n");
			System.out.printf("[ 3 ] Listar Contatos\n");
			System.out.printf("[ 4 ] Pesquisar Contato\n");
			System.out.printf("[ 0 ] Encerrar o Programa\n");
			System.out.print("\nOpção Desejada: ");
			oper = sc.nextInt();
			
			switch (oper) {
			case 1:
				addContato();
				break;
			case 2:
				removerContato();
				break;
			case 3:
				listarContato();
				break;
			case 4:
				procurarContato();
				break;
			case 0:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
			
		}while(oper != 0);
		
	}
	
	static public void addContato() {
		System.out.print("Digite o id: ");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Digite o nome: ");
		name = sc.nextLine();
		
		System.out.print("Digite a idade: ");
		age = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Digite o telefone: ");
		phone = sc.nextLine();
		
		System.out.print("Digite a rua: ");
		street = sc.nextLine();
		
		System.out.print("Digite o numero: ");
		number = sc.nextInt();
		
		sc.nextLine();
		System.out.print("Digite o bairro: ");
		burgh = sc.nextLine();
		
		System.out.print("Digite o cidade: ");
		city = sc.nextLine();
		
		System.out.print("Digite o estado: ");
		state = sc.nextLine();
		
		Contact c = new Contact(id, name, age, phone, new Address(street, number, burgh, city, state));
		contacts.add(c);
		
		System.out.println();
		System.out.println("Cadastro Realizado com sucesso" + "\n");
		
	}
	
	public static void removerContato() {
		System.out.print("Digite o id do contato pare remover: ");
		id = sc.nextInt();
		int posicao = procurarID(id);
		if( posicao != -1) {
			contacts.remove(posicao);
			System.out.println();
			System.out.println("Contato removido" + "\n");
		}else {
			System.out.println("");
			System.out.println("Não há contato com esse id" + "\n");
		}
	}
	
	public static void listarContato() {
		if(contacts.isEmpty()) {
			System.out.println("");
			System.out.println("Não há contatos cadastrados" + "\n");
		}else {
			System.out.println("");
			for(Contact contac : contacts) {
				System.out.println(contac.toString());
			}
			
			System.out.println("");
		}
	}
	
	 public static void procurarContato() {
		System.out.print("Digite o id do contato que deseja pesquisar: ");
		id = sc.nextInt();
		int posicao = procurarID(id);
		if( posicao != -1) {
			System.out.println(contacts.get(posicao).toString());
		}else {
			System.out.println("");
			System.out.println("Não há contato com esse id" + "\n");
		}
	}
	 
	 public static Integer procurarID(int id) {
			
			int contdor = 0;
			for(Contact contact : contacts) {
				if(contact.getId() == id) {
					return contdor;
				}
				contdor++;
			}
			
			return -1;
		}
}