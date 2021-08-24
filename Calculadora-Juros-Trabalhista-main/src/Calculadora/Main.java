package Calculadora;

public class Main {

	public static void main(String[] args) {

		try {

			int result;
			do {
				Util util = new Util();

				util.Menu();

				result = util.ValidaMenu();

				if (result == 0)
					break;
				if (result == 7)
					continue;

				util.ExecutaOperacao(result);

			} while (result != 0);

			System.out.println("A aplicação foi finalizada");
		} catch (Exception e) {
			System.out.println("Ocorreu um erro na aplicação" + e);
		}

	}

}
