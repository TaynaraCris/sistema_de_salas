package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Predio {
	
	Scanner scan = new Scanner(System.in);
	private List <Predio> predios = new ArrayList<>();
	private List <Sala> salas = new ArrayList<>();
	private boolean possuiEstacionamento;
	private String nome;
//	private double taxaOcupacao;

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
	
	
	public void cadastrarSala() {
	/*
- gradeHoraria: ArrayList<Aula>
- taxaOcupacao: double
*/
		Sala sala = new Sala();
		
		System.out.println("Em qual prédio deseja cadastrar a sala?");
	
		for(int i = 0; i <predios.size(); i++) {

			System.out.println(predios.get(i));	
		}

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

		String temProjetor;
		boolean possuiProjetor = false;
		
		do{
			System.out.println("A sala possui projetor? (sim ou nao)");
			temProjetor = scan.next();
			
			if(temProjetor.equalsIgnoreCase("sim")) {
				possuiProjetor = true;
			}else if(temProjetor.equalsIgnoreCase("nao")) {
				possuiProjetor = false;
			}
		
		}while(!temProjetor.equalsIgnoreCase("sim") && !temProjetor.equalsIgnoreCase("nao"));
		
		String temTelevisao;
		boolean possuiTelevisao = false;
		
		do{
			System.out.println("A sala possui televisão? (sim ou nao)");
			temTelevisao = scan.next();
			
			if(temTelevisao.equalsIgnoreCase("sim")) {
				possuiTelevisao = true;
			}else if(temTelevisao.equalsIgnoreCase("nao")) {
				possuiTelevisao = false;
			}
		
		}while(!temTelevisao.equalsIgnoreCase("sim") && !temTelevisao.equalsIgnoreCase("nao"));

		//predio.setPossuiEstacionamento(possuiEstacionamento);

		sala.setNome(nome);
		sala.setELaboratorio(eLaboratorio);
		sala.setPossuiArCondiciondado(possuiArCondicionado);
		sala.setPossuiProjetor(possuiProjetor);
		sala.setPossuiTelevisao(possuiTelevisao);
		sala.setQtdLugares(qtdLugares);

		salas.add(sala);
	}

	public void removerSala() {}



}
