package principal;

import java.util.ArrayList;
import java.util.List;

import aulo18.Animal;
import aulo18.Mamifero;
import aulo18.Passaro;

public class Principal {

	public static void main(String[] args) {
		Animal animal = new Animal("Animal");
		Mamifero mamifero = new Mamifero("Mamífero");
		Passaro passaro = new Passaro("Passaro");
	
		Animal animal2 = mamifero;
		
		Animal animal3 = new Passaro(null);
		
		List<Animal> lista1 = new ArrayList<>();
		
		lista1.add(animal3);
		lista1.add(animal2);
		lista1.add(animal3);

		for(Animal a : lista1) {
			if(a instanceof Mamifero) {
				System.out.println("É mamífero");
			}
			if(a instanceof Passaro) {
				System.out.println("É passaro");
			}
		}

	}

}
