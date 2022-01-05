package Logica;

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner eSeforAmor = new Scanner(System.in);

		int y = eSeforAmor.nextInt();
		int x = eSeforAmor.nextInt();

		while (x != 0 && y != 0) {
			System.out.println("Primeiro");
			y = eSeforAmor.nextInt();
			x = eSeforAmor.nextInt();
			System.out.println("Segundo");
			y = eSeforAmor.nextInt();
			x = eSeforAmor.nextInt();
			if (x == 0 || y == 0) {
				System.out.println("");
			}

		}

		eSeforAmor.close();
	}

}
