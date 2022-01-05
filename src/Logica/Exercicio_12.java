package Logica;

import java.util.Scanner;

public class Exercicio_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Lanchonete = new Scanner(System.in);

		int codigo = Lanchonete.nextInt();
		int quantidade = Lanchonete.nextInt();

		double total;
		if (codigo == 1) {
			total = quantidade * 4.50;
		} else if (codigo == 2) {
			total = quantidade * 5.50;
		} else if (codigo == 3) {
			total = quantidade * 6.40;
		} else if (codigo == 4) {
			total = quantidade * 10.0;
		} else {
			total = quantidade * 1.50;
		}
		System.out.printf("Total do Pedido R$ %.2f%n", total);
		Lanchonete.close();
	}

}
