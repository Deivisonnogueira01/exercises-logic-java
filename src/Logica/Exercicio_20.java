package Logica;

import java.util.Scanner;

public class Exercicio_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner cola = new Scanner(System.in);

	//	int x = 0;

		// double n = cola.nextInt(); /// FATORIAL

		for (int i = 0; i <= 0; i++) {
			double n = cola.nextInt();
			if (n == 1) {
				double resultado = 1;
				System.out.println(resultado);
			} else if (n != 1) {
				double resultado_2 = n = n * (n - 1) * (n - 2) * (n - 3) * 1;
				System.out.println(resultado_2);

			}
		}
		
		cola.close();
	}

}
