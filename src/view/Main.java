package view;

import br.mari.arvoreint.Arvore;

public class Main {

	public static void main(String[] args) {
		Arvore ar = new Arvore ();
		int []vet = {30,15,60,10,20,40,80};
		for(int i:vet) {
			ar.insert(i);
		}
		try {
			ar.infixSearch();//ordem crescente
			System.out.println();
			ar.postfixSearch();
			System.out.println();
			ar.prefixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
