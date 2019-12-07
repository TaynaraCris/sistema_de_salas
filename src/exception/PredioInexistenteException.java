package exception;

public class PredioInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;

	public PredioInexistenteException(String mensagemDeErro) {

		super(mensagemDeErro);
	}

}