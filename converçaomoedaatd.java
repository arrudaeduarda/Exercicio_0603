package exercicio0603;

import java.util.Scanner;

public class converçaomoedaatd {

	public static void main(String[] args) {
		// Variáveis
		double dolar, real;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe a quantia em real: ");
		real = ler.nextDouble();

		//Processamento
		dolar = real*0.20;

		//Saída
		System.out.println("O valor em dólar é de: " +dolar);
		ler.close();


	}

}
