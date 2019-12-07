package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exception.CampoBrancoException;
import exception.CampoPreenchidoIncorretamenteException;

public class Universidade {
	
	Scanner scan = new Scanner(System.in);

	private boolean possuiCentroOlimpico;
	private boolean possuiBiblioteca;
	private String nome;
	private List <Predio> predios = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();

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

	public void cadastrarPredio() /*throws CampoPreenchidoIncorretamenteException*/ {
		Predio predio = new Predio();
		
		System.out.println("Informe o nome do prédio ");
		String nome = scan.next();
		predio.setNome(nome);
		
		System.out.println("Informe o número de salas ");
		int numDeSalas = scan.nextInt();
		predio.setNumDeSalas(numDeSalas);

		String temEstacionamento;
		boolean possuiEstacionamento = false;
		
		do{
			System.out.println("O prédio possui estacionamento? (sim ou nao)");
			temEstacionamento = scan.next();
			
			if(temEstacionamento.equalsIgnoreCase("sim")) {
				possuiEstacionamento = true;
			}else if(temEstacionamento.equalsIgnoreCase("nao")) {
				possuiEstacionamento = false;
			}//else {
				//throw new CampoPreenchidoIncorretamenteException("O campo deve ser preenchido com 'sim' ou 'nao'");
			//}
		
		}while(!temEstacionamento.equalsIgnoreCase("sim") && !temEstacionamento.equalsIgnoreCase("nao"));

		predio.setPossuiEstacionamento(possuiEstacionamento);
		
		predios.add(predio);
	}

	public void removerPredio(Predio predio) {}

	public void criarProfessor() {
		Professor professor = new Professor();
		
		System.out.println("Informe o nome do professor ");
		String nome = scan.next();
		professor.setNome(nome);
		
		System.out.println("Informe a matrícula do professor ");
		String matricula = scan.next();
		professor.setMatricula(matricula);
		
		professores.add(professor);
	}

	public void removerProfesor(Professor professor) {}	

	public void cadastrarPeriodo() {
		/*Periodo periodo = new Periodo();
		
		System.out.println("Informe o início do período ");*/
		
	}

	public void removerPeriodo(Periodo periodo) {}

}