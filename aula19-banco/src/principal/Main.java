package principal;


import java.util.Date;

import conta.Cheque;
import conta.Cliente;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		ContaPoupanca cp1 = new ContaPoupanca();
		Cliente c1 = new Cliente(8147, "Silva", 12345, "123.456.789-45", cp1);
		
		cp1.setTaxaJuros(0.05);
		cp1.depositar(500);
		
		cp1.sacar(10);
		
		Date data = new Date();
		
		Cheque ch1 = new Cheque(200.0, "Santander", data);
		
		System.out.println(ch1.toString());
		
		
		
		ContaCorrente cc1 = new ContaCorrente();
		Cliente c2 = new Cliente(8148, "Souza", 123856, "184.496.589-43", cc1);
		
		cc1.depositar(800);
		cc1.setLimiteChequeEspecial(100.0);
		cc1.sacar(100);
		
		
		
		
		
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}


}
