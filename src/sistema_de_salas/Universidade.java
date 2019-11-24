package sistema_de_salas;

public class Universidade {

	private boolean possuiCentroOlimpico;
	private boolean possuiBiblioteca;
	private String nome;

	public boolean getPossuiCentroOlimpico() {
		return this.possuiCentroOlimpico;
	}

	public void setPossuiCentroOlimpico(boolean possuiCentroOlimpico) {
		this.possuiCentroOlimpico = possuiCentroOlimpico;
	}

	public boolean getPossuiBiblioteca() {
		return this.possuiBiblioteca;
	}

	public void setPossuiBiblioteca(boolean possuiBiblioteca) {
		this.possuiBiblioteca = possuiBiblioteca;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
