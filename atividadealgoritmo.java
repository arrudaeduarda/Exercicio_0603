package exercicio0603;

import java.util.Scanner;

public class atividadealgoritmo {

	public static void main(String[] args) {
		// Variáveis
		double a, b, adiçao, multiplicaçao, divisao, subtraçao;

		//Instanciar classe Scanner 
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe o valor 1: ");
		a = ler.nextDouble();

		System.out.println("Informe o valor 2: ");
		b = ler.nextDouble();

		//Processamento

		adiçao = a + b;
		subtraçao = a - b;
		divisao = a/b;
		multiplicaçao = a*b;

		//Saída 
		System.out.println("O valor da soma é de: " +adiçao);
		System.out.println("O valor da subtração é de: " +subtraçao);
		System.out.println("O valor da divisão é de: " +divisao);
		System.out.println("O valor da multiplicação é de: " +multiplicaçao);
		ler.close();



	}

}
