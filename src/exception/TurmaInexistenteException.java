package exception;

public class TurmaInexistenteException extends Exception{

	private static final long serialVersionUID = 1L;

	public TurmaInexistenteException(String mensagemDeErro) {

		super(mensagemDeErro);
	}
}