package controller;

import br.edu.fateczl.adamczuk.pilhastrings.Pilha;

public class PalindromoController {
	
	
	public PalindromoController() {
		
	}
	
	public boolean comparaPalavras(String palavra) {
		
		
		palavra = palavra.toLowerCase();
		palavra = palavra.replaceAll("\\s+", "");
		
		String palavraInvertida = inverterString(palavra);
		
		if (palavraInvertida.equals(palavra)) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	private String inverterString (String stringOriginal) {
		
		Pilha stack = new Pilha();
		String stringInvertida = "";

		for (int tamanho = 0 ; tamanho != stringOriginal.length() ; tamanho++) {
			char charAtual = stringOriginal.charAt(tamanho);
			stack.push(Character.toString(charAtual));
		}

		while (!stack.isEmpty()) {
			try {
				stringInvertida += stack.pop();
			} catch (Exception e) {

			}
		}
		
		return stringInvertida;
		
	}

}
