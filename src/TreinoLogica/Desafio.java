package TreinoLogica;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DESAFIO 7COMn 2021
		// DEIVISON NOGUEIRA

		int i = 0;
		int divisivel = 0;
		int var = 18;

		do {
			divisivel = 0;
			var += 2;
			for (i = 1; i <= 20; i++) {
				if (var % i == 0)
					divisivel++;
			}
		} while (divisivel != 20);

		System.out.println("O Resultado do Desafio é : " + var);
	}

}
