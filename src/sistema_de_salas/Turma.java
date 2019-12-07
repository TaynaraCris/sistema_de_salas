package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {

	Scanner scan = new Scanner(System.in);

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
	
	public void cadastrarAula() {
		
		Aula aula = new Aula();

		System.out.println("Informe o nome da aula: ");
		String nome = scan.next();
		aula.setNome(nome);
		
		//System.out.println("Informe o período da aula: ");
		//- periodo: Periodo
		
		System.out.println("Informe o dia da aula: ");
		String dia = scan.next();
		aula.setDia(dia);
		
	}

	public void removerAula() {}
}
