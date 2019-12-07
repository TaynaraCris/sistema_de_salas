package sistema_de_salas;

public class Disciplina {

	private String nome;
	private int creditos;
	private int numDeTurmas;
	private String codigoDisciplina;

	public void cadastrarTurma() {}

	public void removerTurma() {}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCreditos() {
		return this.creditos;
	}

	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}

	public int getNumDeTurmas() {
		return this.numDeTurmas;
	}

	public void setNumDeTurmas(int numDeTurmas) {
		this.numDeTurmas = numDeTurmas;
	}

	public String getCodigoDisciplina() {
		return this.codigoDisciplina;
	}

	public void setCodigoDisciplina(String codigoDisciplina) {
		this.codigoDisciplina = codigoDisciplina;
	}

}
