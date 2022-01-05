package TreinoLogica;

import java.io.IOException;
import java.util.Scanner;

public class QualNumero {

	public static void main(String[] args) throws IOException {

		Scanner leitor = new Scanner(System.in);

		int N = 0; 
		
	    leitor.next();

		for (int i = 0; i < N; i++) {
			int x = leitor.nextInt();

			if (x == 0)
				System.out.println("NULL");

			else if (x % 2 == 0 && x < 0)
				System.out.println("Par e negativo");

			else if (x % 2 == 0 && x > 0)
				System.out.println("PAR e positivo");

			else if (x % 2 != 0 && x > 0)
				System.out.println("Impar e positivo");

			else if (x % 2 != 0 && x < 0)
				System.out.println("impar e Negativo");

		}
		
		leitor.close();
	}

}
