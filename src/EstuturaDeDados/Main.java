package EstuturaDeDados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
		
		//Conjunto
		Set<Carro> hashSetCarros = new HashSet<>();
		
		hashSetCarros.add(new Carro("JAGUAR"));
		hashSetCarros.add(new Carro("BMW"));
		hashSetCarros.add(new Carro("FIAT"));
		hashSetCarros.add(new Carro("FERRARI"));
		hashSetCarros.add(new Carro("LAMBO"));
		
		System.out.println(hashSetCarros);
		

		Set<Carro> treeSetCarros = new TreeSet<>();
		
		treeSetCarros.add(new Carro("Chevrolet"));
		treeSetCarros.add(new Carro("Ranger Rover"));
		treeSetCarros.add(new Carro("Honda"));
		
		System.out.println(treeSetCarros);
		
		
	}

}
