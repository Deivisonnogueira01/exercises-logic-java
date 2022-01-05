package Logica;

import java.util.Scanner;

public class Exercicio_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Qual é O numero");
		int D = sc.nextInt();

		if (D % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

		sc.close();
	}

}
