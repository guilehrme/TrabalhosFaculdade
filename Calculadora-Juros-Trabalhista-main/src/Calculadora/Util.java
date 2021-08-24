package Calculadora;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Util {

	public Scanner teclado = new Scanner(System.in);

	public void Menu() {
		System.out.println("Calculadora\n");
		System.out.println("1- Juros Simples");
		System.out.println("2- Juros Compostos");
		System.out.println("3- Salário Líquido");
		System.out.println("4- Décimo Terceiro");
		System.out.println("5- Férias");
		System.out.println("0- Sair\n");
	}

	public int ValidaMenu() {

		int result;
		try {
			teclado = new Scanner(System.in);
			result = teclado.nextInt();
		} catch (Exception ex) {
			result = 7;
		}

		if (result == 7) {
			System.out.println("Digite um número válido");
			return 7;
		}
		switch (result) {

		case 1: {
			return result;
		}
		case 2: {
			return result;
		}
		case 3: {
			return result;
		}
		case 4: {
			return result;
		}
		case 5: {
			return result;
		}
		case 0: {
			return result;
		}
		case 7: {
			System.out.println("Digite um número válido");
			return 7;
		}
		default: {
			System.out.println("Digite um número válido");
			return 7;
		}
		}
	}

	public String ArredondaValor(double valor) {
		DecimalFormat formatador = new DecimalFormat("0.000");
		return formatador.format(valor);
	}

	public void ExecutaOperacao(int operacao) {
		Contas conta = new Contas();
		switch (operacao) {

		case 1: {
			conta.JurosSimples();
			break;
		}
		case 2: {
			conta.JurosCompostos();
			break;
		}
		case 3: {
			conta.SalarioLiquido();
			break;
		}
		case 4: {
			conta.DecimoTerceiro();
			break;
		}
		case 5: {
			conta.Ferias();
			break;
		}
		default: {
			System.out.println("Valor inválido");
		}
		}
	}

	public static double DigiteValor() {
		try {
			@SuppressWarnings("resource")
			Scanner teclado = new Scanner(System.in);
			double result = teclado.nextDouble();
			return result;
		} catch (Exception e) {
			System.out.println("Por favor digite números válidos");
			return DigiteValor();
		}
	}

}
