package exception;

public class TipoDeAulaNaoAtribuidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public TipoDeAulaNaoAtribuidoException (String mensagemDeErro) {

		super(mensagemDeErro);
	}
}