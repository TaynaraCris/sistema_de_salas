package sistema_de_salas;

public class Aula {

	private String nome;
	private Periodo periodo;
	private String dia;

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDia() {
		return this.dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Periodo getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}
}