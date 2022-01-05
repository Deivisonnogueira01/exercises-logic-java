package Logica;

import java.util.Locale;

public class Exercicio_7 {

	public static void main(String[] args) {

		String product1 = "COMPUTER";
		String product2 = "Office desk";

		int age = 19;
		int code = 5290;
		char gender = 'F';

		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products: ");
		System.out.printf("Products: %s, which price is R$ %.2f%n ", product1, price1);
		System.out.printf("%s, which price is R$ %.2f%n ", product2, price2);
		System.out.println();
		System.out.printf("record %d years old, code %d and gender : %c%n ", age, code, gender);
		System.out.printf("measue with eight decimal places : %.8f%n ", measure);
		System.out.printf("rouded %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf(" US %.3f%n", measure);

	}

}
