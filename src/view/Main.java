package view;

import javax.swing.JOptionPane;

import controller.PalindromoController;

public class Main {

	public static void main(String[] args) {
		PalindromoController palindromo = new PalindromoController();

		String entrada = null;
		do {
			entrada = JOptionPane.showInputDialog("Inserir uma palavra ou frase para descobrir se é palíndromo");
		} while (entrada.isBlank());
		
		if (palindromo.comparaPalavras(entrada)) {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" é um palindromo");
		}

		else {
			JOptionPane.showMessageDialog(null, "\"" + entrada + "\" não é um palindromo");
		}
	}

}
