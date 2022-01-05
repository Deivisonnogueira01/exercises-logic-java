package Dio;

public class EstruturadeDadosVetor {

	public static void main(String[] args) {

		double[] temper = new double[365];

		temper[0] = 32.0;
		temper[1] = 33.0;
		temper[2] = 35.0;
		temper[3] = 37.0;
		temper[4] = 37.5;

		System.out.println("O valor da Temperatura do dia 3 é : " + temper[2]); // acessar posiçao

		System.out.println("O tamanho da lista é:" + temper.length); // Tamanho do vetor

	}

}
