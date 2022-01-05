package Logica;

import java.util.Scanner;

public class Exercicio_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner rodatudo = new Scanner(System.in);
		System.out.println("Digite a Senha");
		int senha = rodatudo.nextInt();

		while (senha != 2002) {
			System.out.println("Tente Novamente");
			senha = rodatudo.nextInt();
			if (senha == 2002) {
				System.out.println("Senha correta");
			}

		}

		System.out.println("Fim");
		rodatudo.close();

	}
}
