package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String nome;
	private List<Professor> professores = new ArrayList<>();
	private int numeroDeVagas;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public void getProfessores() {}

//	public setProfessor(Professor) {}

	public int getNumeroDeVagas() {
		return this.numeroDeVagas;
	}

	public void setNumeroDeVagas(int numeroDeVagas) {
		this.numeroDeVagas = numeroDeVagas;
	}
}
