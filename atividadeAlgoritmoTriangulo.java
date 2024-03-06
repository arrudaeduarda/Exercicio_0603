package exercicio0603;

import java.util.Scanner;

public class atividadeAlgoritmoTriangulo {

	public static void main(String[] args) {
		// Variáveis
		double base, altura, area;

		//Instanciar classe Scanner 
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe o valor da base: ");
		base = ler.nextDouble();

		System.out.println("Informe o valor da altura: ");
		altura = ler.nextDouble();

		//Processamento 
		area = (base*altura)/2;

		//Saída
		System.out.println("O valor da base é de: " +area);
		ler.close();
	}

}
