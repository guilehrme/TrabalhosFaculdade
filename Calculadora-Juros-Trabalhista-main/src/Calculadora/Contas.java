package Calculadora;

public class Contas {

	public void JurosSimples()

	{
		try {
			System.out.println("Digite o Valor Inicial");
			double valorInicial = Util.DigiteValor();

			System.out.println("Digite a Taxa de Juros (Apenas digitos)");
			double taxaJuros = Util.DigiteValor();

			System.out.println("Digite o Per�odo em Meses");
			double periodoMeses = Util.DigiteValor();

			double result = valorInicial * (taxaJuros / 100) * periodoMeses + valorInicial;
			Util util = new Util();
			util.ArredondaValor(result);

			System.out.println(
					"O seu valor inicial foi de: R$ " + valorInicial + "\n" + "A taxa de Juros aplicada foi de: "
							+ taxaJuros + "%" + "\n" + "O Peri�do de Meses utilizado foi de: " + periodoMeses + " Meses"
							+ "\n" + "O Valor Calculado foi de: R$ " + result + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no c�lculo do Juros Simples" + e);
		}
	}

	public void JurosCompostos()

	{
		try {
			System.out.println("Digite o Valor Inicial");
			double valorInicial = Util.DigiteValor();

			System.out.println("Digite a Taxa de Juros (Apenas digitos)");
			double taxaJuros = Util.DigiteValor();

			System.out.println("Digite o Per�odo em Meses");
			double periodoMeses = Util.DigiteValor();

			double result = valorInicial * Math.pow((1 + taxaJuros / 100), periodoMeses);
			Util util = new Util();
			System.out.println(
					"O seu valor inicial foi de: R$ " + valorInicial + "\n" + "A taxa de Juros aplicada foi de: "
							+ taxaJuros + "%" + "\n" + "O Peri�do de Meses utilizado foi de: " + periodoMeses + " Meses"
							+ "\n" + "O Valor Calculado foi de: R$ " + util.ArredondaValor(result)  + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no c�lculo do Juros Compostos" + e);
		}
	}

	public void SalarioLiquido()

	{
		try {
			System.out.println("Digite o Valor do Sal�rio Bruto");
			double salarioBruto = Util.DigiteValor();

			double result = ValorINSS(salarioBruto);
			result = ValorIRRF(result);

			Util util = new Util();
			System.out.println("O Valor bruto � de: " + salarioBruto + "O seu Sal�rio L�quido � de: R$ "
					+ util.ArredondaValor(result) + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no c�lculo do Sal�rio L�quido" + e);
		}
	}

	public void DecimoTerceiro() {
		try {
			System.out.println("Digite o Valor do Sal�rio");
			double salario = Util.DigiteValor();

			System.out.println("Digite a Quantidade de Meses Trabalhados no Ano");
			double meses = Util.DigiteValor();

			double result = (salario / 12) * meses;

			Util util = new Util();
			System.out.println("O Valor a receber � de: R$ " + util.ArredondaValor(result) + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no c�lculo do D�cimo Terceiro" + e);
		}
	}

	public void Ferias() {
		try {
			System.out.println("Digite o Valor do Sal�rio Bruto");
			double salarioBruto = Util.DigiteValor();

			salarioBruto = salarioBruto * 1.3333333;
			
			double result = ValorINSS(salarioBruto);
			result = ValorIRRF(result);

			Util util = new Util();
			System.out.println("O Valor l�quido a receber nas f�rias � de: R$ " + util.ArredondaValor(result) + "\n");
		} catch (

		Exception e) {
			System.out.println("Ocorreu um erro no c�lculo das f�rias" + e);
		}
	}

	public double ValorINSS(double salario) {
		if (salario <= 1556.94) {
			double inss = salario * 0.08;
			return salario -= inss;
		} else if (salario > 1556.94 && salario <= 2594.92) {
			double inss = salario * 0.09;
			return salario -= inss;
		} else if (salario > 2594.92 && salario <= 5189.82) {
			double inss = salario * 0.11;
			return salario -= inss;
		} else {
			double inss = 570.88;
			return salario -= inss;
		}
	}

	public double ValorIRRF(double salario) {

		if (salario <= 1903.38) {
			return salario;
		} else if (salario > 1903.38 && salario <= 2826.65) {

			double aliquota = 0.075;
			double taxa = 142.80;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else if (salario > 2826.65 && salario <= 3751.05) {

			double aliquota = 0.15;
			double taxa = 354.80;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else if (salario > 3751.05 && salario <= 4664.68) {

			double aliquota = 0.225;
			double taxa = 636.13;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		} else {

			double aliquota = 0.275;
			double taxa = 869.36;

			double irrf = (salario * aliquota) - taxa;
			return salario -= irrf;
		}

	}

}
