package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Ol�!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o n�mero do funcion�rio:");
		int number = sc.nextInt();
		System.out.println("Digite o n�mero de horas trabalhadas:");
		double hours = sc.nextDouble();
		System.out.println("Digite o valor da hora de trabalho (R$):");
		double value = sc.nextDouble();
		sc.close();
		double salary = hours*value;
		
		System.out.printf("Funcion�rio n�mero: %d%n", number);
		System.out.printf("Sal�rio: R$%.2f%n", salary);

	}

}
