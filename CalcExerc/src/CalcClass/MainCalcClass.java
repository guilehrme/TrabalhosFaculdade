package CalcClass;

import java.util.Scanner;

public class MainCalcClass {

	public static void main(String[] args) {
		CalcExerc calc = new CalcExerc();

		int opcao = 100;
		int val1;
		int val2;

		while (opcao != 0) {
			Scanner input0 = new Scanner(System.in);
			System.out.println("Escolha uma das opções abaixo (valeral):");
			System.out.println("1 - Soma");
			System.out.println("2 - Subtração");
			System.out.println("3 - Multiplicação");
			System.out.println("4 - Divisão");
			System.out.println("0 - Sair");
			System.out.println("Escolha: ");

			opcao = input0.nextInt();
			boolean error = false;
		
			if (opcao == 0) {
				System.out.println("Saindo");
				break;
			}

			else if (opcao != 4 && opcao != 1 && opcao != 2 && opcao != 3) {
				System.out.println("Coloque uma opção válida da próxima vez");
				error = true;
			}
			if (error == false) {
				Scanner input1 = new Scanner(System.in);

				System.out.println("Qual será o primeiro valor? ");
				val1 = input1.nextInt();
				System.out.println("Qual será o segundo valor? ");
				val2 = input1.nextInt();
				int operacao;

				switch (opcao) {
				case 1:
					operacao = calc.som(val1, val2);
					System.out.printf("\nO resultado da soma é: %d\n", operacao);
					break;
				case 2:
					operacao = calc.sub(val1, val2);
					System.out.printf("\nO resultado da subtração é: %d\n", operacao);
					break;
				case 3:
					operacao = calc.mult(val1, val2);
					System.out.printf("\nO resultado da multiplicação é: %d\n", operacao);
					break;
				case 4:
					operacao = calc.div(val1, val2);
					System.out.printf("\nO resultado da divisão é: %d\n", operacao);
					break;

				}

			}

		}
	}
} 
