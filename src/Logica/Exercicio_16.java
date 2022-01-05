package Logica;

import java.util.Scanner;

public class Exercicio_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner toCansando = new Scanner(System.in);

		System.out.println("Aperte Um numero");

		int x = toCansando.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println("Os Numeros Impares São : " + i);
			}
			
			toCansando.close();
		}
	}

}
