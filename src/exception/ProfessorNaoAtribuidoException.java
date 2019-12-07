package exception;

public class ProfessorNaoAtribuidoException extends Exception{

	private static final long serialVersionUID = 1L;

	public ProfessorNaoAtribuidoException(String mensagemDeErro){

		super(mensagemDeErro);
	}
}