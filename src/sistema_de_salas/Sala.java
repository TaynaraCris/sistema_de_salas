package sistema_de_salas;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private int qtdLugares;
	private boolean eLaboratorio;
	private boolean possuiArCondicionado;
	private boolean possuiProjetor;
	private boolean possuiTelevisao;
//	private List <Aula> gradeHoraria = new ArrayList<>();
	private String nome;
//	private double taxaOcupacao;

	public int getQtdLugares() {
		return this.qtdLugares;
	}

	public void setQtdLugares(int qtdLugares) {
		this.qtdLugares = qtdLugares;
	}

	public boolean getELaboratorio() {
		return this.eLaboratorio;
	}

	public void setELaboratorio(boolean eLaboratorio) {
		this.eLaboratorio = eLaboratorio;
	}

	public boolean getPossuiArCondiciondado() {
		return this.possuiArCondicionado;
	}

	public void setPossuiArCondiciondado(boolean possuiArCondicionado) {
		this.possuiArCondicionado = possuiArCondicionado;
	}

	public boolean getPossuiProjetor() {
		return this.possuiProjetor;
	}

	public void setPossuiProjetor(boolean possuiProjetor) {
		this.possuiProjetor = possuiProjetor;
	}

	public boolean getPossuiTelevisao() {
		return this.possuiTelevisao;
	}

	public void setPossuiTelevisao(boolean possuiTelevisao) {
		this.possuiTelevisao = possuiTelevisao;
	}

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

//	public double getTaxaOcupacao() {}

//	public void setTaxaOcupacao(double taxaOcupacao) {}

	public void adicionarAula(Aula aula) {

		


	}

//	public void removerAula(Aula) {}

}
