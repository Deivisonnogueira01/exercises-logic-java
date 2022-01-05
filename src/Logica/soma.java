package Logica;

import java.util.Scanner;

//Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

//Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias. Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364. Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

//O arquivo de entrada contém um valor inteiro.

public class soma {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Entre Com seus dias de vida");
		int idade = sc.nextInt();

		int ano = idade / 365;

		int mes = (idade % 365) / 30;

		int dias = (idade % 365) % 30;

		System.out
				.println("Ela Possui : " + ano + " Ano de Idade  e " + mes + " meses " + "e " + dias + " dias de vida");

		sc.close();
	}

}
