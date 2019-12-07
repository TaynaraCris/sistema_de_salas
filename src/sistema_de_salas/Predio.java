package sistema_de_salas;

import java.util.Scanner;

public class Predio {
	
	Scanner scan = new Scanner(System.in);

	private int numDeSalas;
	private boolean possuiEstacionamento;
	private String nome;
//	private double taxaOcupacao;
	
	public void cadastrarSala() {
	/*	- eLaboratorio: boolean
		- possuiArCondicionado: boolean
		- possuiProjetor: boolean
		- possuiTelevisao: boolean
		- gradeHoraria: ArrayList<Aula>
		- taxaOcupacao: double*/

		Sala sala = new Sala();
		
		System.out.println("Informe o nome da sala ");
		String nome = scan.next();
		sala.setNome(nome);
		
		System.out.println("Informe a quantidade de lugares da sala ");
		int qtdLugares = scan.nextInt();
		sala.setQtdLugares(qtdLugares);
/*
		System.out.println("O prédio possui estacionamento? (sim ou nao)");
		String temEstacionamento = scan.next();
		boolean possuiEstacionamento = false;
		
		if(temEstacionamento.equalsIgnoreCase("sim")) {
			possuiEstacionamento = true;
		}else if(temEstacionamento.equalsIgnoreCase("nao")) {
			possuiEstacionamento = false;
		}*/


	}

	public void removerSala() {}

	public int getNumDeSalas() {
		return this.numDeSalas;
	}

	public void setNumDeSalas(int numDeSalas) {
		this.numDeSalas = numDeSalas;
	}

	public boolean getPossuiEstacionamento() {
		return this.possuiEstacionamento;
	}

	public void setPossuiEstacionamento(boolean possuiEstacionamento) {
		this.possuiEstacionamento = possuiEstacionamento;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*public double getTaxaOcupacao() {
		
	}*/

}
