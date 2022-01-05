
package Dio;
/*
import java.util.Scanner;

public class Main {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
		
			int graoCasa = 1, casasTabuleiro = 64;
			int graos = 1;
			
		    int n = sc.nextInt();
			
			for(int i=1 ; i<casasTabuleiro ; i++) {
			  graoCasa =graoCasa * 2;
			  graos += graoCasa;
			  
			
				System.out.println(graos + "kg");  
			}
			   sc.close();
		}
	}	*/

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double graosCasa = 1, casasTabuleiro = 64;
		int graos = 1;

		for (int x = 1; x < casasTabuleiro; x++) {
			graosCasa = graosCasa * 2;
			graos += graosCasa;
		}

		System.out.println("\nO quantidade de grãos é: " + graos);
          entrada.close();
	}
}
