package Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Produto> lista = new ArrayList<>();
		
		lista.add( new Produto("TV", 900.00, 10) );		
		lista.add( new Produto("Microondas", 200.00, 100) );
		
		lista.stream().forEach(x -> System.out.println(x.getNome()));	
		
		List<Produto> r = lista.stream()
				.filter(x -> x.getPreco() < 300)
				.collect(Collectors.toList());
		
		r.stream().forEach(x -> System.out.println(x.getNome()));

	}

}
