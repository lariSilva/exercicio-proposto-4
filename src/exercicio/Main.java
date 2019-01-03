package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("Olá!");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do funcionário:");
		int number = sc.nextInt();
		System.out.println("Digite o número de horas trabalhadas:");
		double hours = sc.nextDouble();
		System.out.println("Digite o valor da hora de trabalho (R$):");
		double value = sc.nextDouble();
		sc.close();
		double salary = hours*value;
		
		System.out.printf("Funcionário número: %d%n", number);
		System.out.printf("Salário: R$%.2f%n", salary);

	}

}
