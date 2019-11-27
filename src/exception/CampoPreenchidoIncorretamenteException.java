package exception;

public class CampoPreenchidoIncorretamenteException extends Exception{

	private static final long serialVersionUID = 1L;
	
	public CampoPreenchidoIncorretamenteException(String mensagemDeErro) {
		
		super(mensagemDeErro);
	}

}
