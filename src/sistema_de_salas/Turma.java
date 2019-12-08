package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Turma {

	Scanner scan = new Scanner(System.in);

	private String nome;
	private List<Professor> professores = new ArrayList<>();
	private int numeroDeVagas;
	private List<Aluno> alunos = new ArrayList<>();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return this.professores;
	}

	public void setProfessores(Professor professor) {
		professores.add(professor);
	}

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

	public void cadastrarAluno() {
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome do aluno: ");
		String nome = scan.next();
		aluno.setNome(nome);

		System.out.println("Informe a matrícula do aluno: ");
		String matricula = scan.next();
		aluno.setMatricula(matricula);
		
		alunos.add(aluno);
	}
}