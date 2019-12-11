package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Disciplina {

	Scanner scan = new Scanner(System.in);

	private String nome;
	private int creditos;
	private int numDeTurmas;
	private String codigoDisciplina;
	private List <Turma> turmas = new ArrayList<>();

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

	public void cadastrarTurma() {

		Turma turma = new Turma();

		System.out.println("Informe o nome da turma: ");
		String nome = scan.next();
		turma.setNome(nome);

		System.out.println("Informe o número de vagas: ");
		int numeroDeVagas = scan.nextInt();
		turma.setNumeroDeVagas(numeroDeVagas);
		
		//- professores: ArrayList<Professor>
		//-alunos: ArrayList<Aluno>
		turmas.add(turma);

	}

	public void removerTurma() {}


}
