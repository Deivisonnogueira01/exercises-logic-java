package Logica;

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1;
		int y1;
		int x2;
		int y2;
		// se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1
		// movimento
		// se estiver em qualquer outra posi��o, a rainha gastar� 2 movimentos!

		while (true) {
			x1 = sc.nextInt();
			y1 = sc.nextInt();
			x2 = sc.nextInt();
			y2 = sc.nextInt();
			if (x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0)
				break; // condi��o de parada
			if (x1 == x2 && y1 == y2) {

				System.out.println("0");
			} else if (x1 == y1 || y2 == x2) {
				System.out.println("1");
			}
			// else if( )
			// System.out.println( ); */
			else
				System.out.println("2");
		}
		sc.close();
	}
}
