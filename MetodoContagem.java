package Sobrecarga;

public class MetodoContagem {

	public static int Contar(int numero) {

		for (; numero <= 10; numero++) {

			System.out.print(numero + " ");

		}

		return numero;
	}

	public static int Contar(int numero, int fim) {

		for (; numero <= fim; numero++) {

			System.out.print(numero + " ");

		}

		return numero;
	}

	public static int Contar(int numero, int fim, int pausa) {
		try {

			for (; numero <= fim; numero++) {

				System.out.print(numero + " ");

				Thread.sleep(pausa * 1000);
			}
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}

		return numero;
	}

}
