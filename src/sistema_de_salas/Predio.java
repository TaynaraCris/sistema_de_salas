package sistema_de_salas;

import java.util.Scanner;

public class Predio {
	
	Scanner scan = new Scanner(System.in);

	private int numDeSalas;
	private boolean possuiEstacionamento;
	private String nome;
//	private double taxaOcupacao;
	
	public void cadastrarSala() {
	/*	- possuiProjetor: boolean
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

		String possuiLaboratorio;
		boolean eLaboratorio = false;
		
		do{
			System.out.println("A sala é de laboratório? (sim ou nao)");
			possuiLaboratorio = scan.next();
			
			if(possuiLaboratorio.equalsIgnoreCase("sim")) {
				eLaboratorio = true;
			}else if(possuiLaboratorio.equalsIgnoreCase("nao")) {
				eLaboratorio = false;
			}
		
		}while(!possuiLaboratorio.equalsIgnoreCase("sim") && !possuiLaboratorio.equalsIgnoreCase("nao"));

		String temArCondicionado;
		boolean possuiArCondicionado = false;
		
		do{
			System.out.println("A sala possui ar condicionado? (sim ou nao)");
			temArCondicionado = scan.next();
			
			if(temArCondicionado.equalsIgnoreCase("sim")) {
				possuiArCondicionado = true;
			}else if(temArCondicionado.equalsIgnoreCase("nao")) {
				possuiArCondicionado = false;
			}
		
		}while(!temArCondicionado.equalsIgnoreCase("sim") && !temArCondicionado.equalsIgnoreCase("nao"));

		
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
