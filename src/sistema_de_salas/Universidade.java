package sistema_de_salas;

import java.util.Scanner;

public class Universidade {
	
	Scanner scan = new Scanner(System.in);

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

	public void cadastrarPredio() {
		Predio predio = new Predio();
		
		System.out.println("Informe o nome do prédio ");
		String nome = scan.next();
		predio.setNome(nome);
		
		System.out.println("Informe o número de salas ");
		int numDeSalas = scan.nextInt();
		predio.setNumDeSalas(numDeSalas);

		System.out.println("O prédio possui estacionamento? (sim ou nao)");
		String temEstacionamento = scan.next();
		boolean possuiEstacionamento = false;
		
		if(temEstacionamento == "sim") {
			possuiEstacionamento = true;
		}else if(temEstacionamento == "nao") {
			possuiEstacionamento = false;
		}
		
		predio.setPossuiEstacionamento(possuiEstacionamento);
	}

}
