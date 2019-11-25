package sistema_de_salas;

import exception.CampoPreenchidoIncorretamenteException;

public class Main {

	public static void main(String[] args) {
		
		Universidade unb = new Universidade();
		
		try (unb.cadastrarPredio()) {
		    // success
		} catch (CampoPreenchidoIncorretamenteException exc) {
		    System.out.println(exc);
		}

	}

}
