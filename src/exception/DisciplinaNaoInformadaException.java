package exception;

public class DisciplinaNaoInformadaException extends Exception{

	private static final long serialVersionUID = 1L;

	public DisciplinaNaoInformadaException(String mensagemDeErro) {
		
		super(mensagemDeErro);
	}
}
