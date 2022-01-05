package Logica;

import java.util.Scanner;

public class Exercicio_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Qual é o Numero escolhido ? : ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Seu Número é negativo");
		} else {
			System.out.println("Seu Numero é Positivo");
		}

		System.out.println("Fim Programa");

		sc.close();
	}

}
