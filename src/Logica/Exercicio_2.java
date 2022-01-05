package Logica;

import java.util.Scanner;

public class Exercicio_2 {

	public static void main(String[] args) {

		System.out.println("Entre com o Valor : ");
		Scanner sc = new Scanner(System.in);

		double raio, Area, pi = 3.14159;

		raio = sc.nextDouble();

		Area = pi * raio * raio;

		System.out.printf("A=%.4f%n", Area); // formula que faz o sistema receber o resultado com +
												// + 4 casas decimais

		sc.close();
	}

}
