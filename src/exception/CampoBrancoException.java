package exception;

public class CampoBrancoException extends Exception{
	
	private static final long serialVersionUID = 1L;

	public CampoBrancoException(String mensagemDeErro) {
		
		super(mensagemDeErro);
	}
}