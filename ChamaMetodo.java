package Sobrecarga;

import javax.swing.JOptionPane;

public class ChamaMetodo {

	public static void main(String[] args) {

		/*
		 * Crie uma classe chamada Contagem que contenha quatro métodos com o nome
		 * “contar” utilizan- do o conceito da sobrecarga. A assinatura e função de cada
		 * método aparecem descritas na tabela
		 * 
		 * a seguir. Faça também outra classe para testar o método.
		 */
		int pausa = 0;
		int opcoes = 0;
		int numeroFornecido = 0;
		int fim = 0;

		do {

			try {

				opcoes = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Digite um número \n1-Contagem 1 a 10 \n2-Escolha o Inicio & Fim \n3-Inicia em 1 e defina o fim \n4-Inicio ,Fim & Pausa"));

				if (opcoes <= 0) {
					JOptionPane.showMessageDialog(null, "ERRO");
					break;

				}

			} catch (NumberFormatException e) {

				JOptionPane.showMessageDialog(null, " Ocorreu um erro inesperado!!");
			}

			switch (opcoes) {

			case 1:

				int inicio = 1;

				MetodoContagem.Contar(inicio);

				System.out.println("");

				break;

			case 2:

				inicio = 1;

				try {

					fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor limite para o fim"));

					if (fim <= 0) {

						JOptionPane.showMessageDialog(null, "ERRO");

						break;
					}

				} catch (NumberFormatException e) {

					JOptionPane.showMessageDialog(null, "ERRO");

					break;
				}

				MetodoContagem.Contar(inicio, fim);

				System.out.println("");

				break;

			case 3:

				try {
					numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de inicio"));

					fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de limite"));

					if (fim <= 0) {
						JOptionPane.showMessageDialog(null, "ERRO");

					}

				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERRO");
				}

				MetodoContagem.Contar(numeroFornecido, fim);

				System.out.println("");

				break;

			case 4:

				try {
					numeroFornecido = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de início"));
					fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número de limite"));
					pausa = Integer.parseInt(
							JOptionPane.showInputDialog(null, "Digite a quantidade da pausa em número inteiro"));

					if (fim <= 0 || pausa <= 0) {
						JOptionPane.showMessageDialog(null,
								"ERRO: O número de limite e a pausa devem ser maiores que zero.");
					} else {
						MetodoContagem.Contar(numeroFornecido, fim, pausa);
						JOptionPane.showMessageDialog(null, "Contagem concluída");
					}
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "ERRO: Certifique-se de inserir números válidos.");
				}

				System.out.println("");
				break;

			default:

				JOptionPane.showMessageDialog(null, "Nenhuma opção foi selecionada");

				System.out.println("");

				break;

			}

		} while (opcoes != 0 || numeroFornecido != 0);

	}

}
