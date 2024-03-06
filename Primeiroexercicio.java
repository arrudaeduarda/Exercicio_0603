package exercicio0603;

import java.util.Scanner;

public class Primeiroexercicio {

	public static void main(String[] args) {
		// Variáveis
		double Fahrenheit;
		final double Celsius; 

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe a temperatura em Fahrenheit: ");
		Fahrenheit = ler.nextDouble();

		//Processamento
		Celsius = ((Fahrenheit -32)*5)/9;

		//Saída
		System.out.println("O valor em graus Celsius é igual a: " + Celsius);
		ler.close();



	}

}
