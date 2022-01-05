package Logica;

import java.util.Scanner;

public class Exercicio_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tododia = new Scanner(System.in);
		int in = 0;
		int out = 0;

		int n = tododia.nextInt();
		for (int i = 0; i < n; i++) {
			if (n >= 10 && n <= 20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");
		tododia.close();
	}

}
