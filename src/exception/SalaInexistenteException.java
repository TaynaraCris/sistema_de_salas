package exception;

public class SalaInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;

	public SalaInexistenteException(String mensagemDeErro) {

		super(mensagemDeErro);
	}
}