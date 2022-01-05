package Logica;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leitura = new Scanner(System.in);

		System.out.println("Entre com O Primeiro Numero : ");
		int one = leitura.nextInt();

		System.out.println("Entre Com O Segundo Numero a ser Somado :");
		int two = leitura.nextInt();

		int resultado = one + two;

		System.out.println("A soma e :" + resultado);
		
		leitura.close();
	}

}
