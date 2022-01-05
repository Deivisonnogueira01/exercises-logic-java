package Logica;

import java.util.Scanner;

public class Exercicio_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int D = sc.nextInt();
		int B = sc.nextInt();

		if (D % B == 0 || B % D == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao Sao Multiplos");
		}
         sc.close();
	}

}
