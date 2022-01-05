package Logica;

import java.util.Scanner;

public class Exercicio_19 {

	public static void main(String[] args) {
		

		Scanner tododoido = new Scanner(System.in);

		double x = 0;
		double y = 0;

		// int n = tododoido.nextInt();
		for (int i = 0; i <= 0; i++) {

			x = tododoido.nextInt();
			y = tododoido.nextInt();
			double resultado = x / y;
			if (y == 0) {
				System.out.println("Divisao Impossivel");
			} else if (y != 0) {
				System.out.println(resultado);
			}
		}
		
		tododoido.close();

	}

}
