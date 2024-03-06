package exercicio0603;

import java.util.Scanner;

public class Calculadorakm {

	public static void main(String[] args) {
		// Variáveis 
		double valorgasolina, distpercorrida, consmedio, litrosgastos, custototal;

		//Instanciar classe Scanner
		Scanner ler = new Scanner(System.in);

		//Entrada de dados
		System.out.println("Informe o valor do litro da gasolina: ");
		valorgasolina = ler.nextDouble();

		System.out.println("Informe a distância percorrida em km: ");
		distpercorrida = ler.nextDouble();

		System.out.println("Informe o valor médio consumido por km: ");
		consmedio = ler.nextDouble();

		//Processamento
		litrosgastos = distpercorrida/consmedio;
		custototal = valorgasolina*distpercorrida;

		//Saída
		System.out.println("A quantidade de litros gastos no trajeto é de: "+ litrosgastos); 
		System.out.println("O custo total com o combustível é de: "+custototal);
		ler.close();

	}

}
