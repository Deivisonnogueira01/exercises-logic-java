package Logica;

import java.util.Scanner;

public class Exercicio_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Torcicolo = new Scanner(System.in);

		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;

		System.out.println("MENU DO POSTO");
		System.out.println("Aperte 1 Para ALCOOL");
		System.out.println("Aperte 2 Para Gasolina");
		System.out.println("Aperte 3 Para DIESEL");

		int select = Torcicolo.nextInt();

		while (select != 4) {

			if (select == 1) {
				alcool = alcool + 1;
				System.out.println("Voce Escolheu Alcool" + alcool);
			} else if (select == 2) {
				gasolina = gasolina + 1;
				System.out.println("Voce Escolheu Gasolina" + gasolina);
			} else if (select == 3) {
				diesel = diesel + 1;
				System.out.println("Voce Escolheu Diesel" + diesel);
			}

			select = Torcicolo.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);

		Torcicolo.close();
	}

}
