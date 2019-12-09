package sistema_de_salas;

public class TipoAula {

	private boolean graduacao;
	private boolean posGraduacao;
	private boolean extensao;

  public TipoAula(boolean graduacao, boolean posGraduacao, boolean extensao) {
    this.graduacao = graduacao;
    this.posGraduacao = posGraduacao;
    this.extensao = extensao;
  }

	public boolean getGraducao() {
		return this.graduacao;
	}

	public void setGraduacao(boolean graduacao) {
		this.graduacao = graduacao;
	}

	public boolean getPosGraduacao() {
		return this.posGraduacao;
	}

	public void setPosGraduacao(boolean posGraduacao) {
		this.posGraduacao = posGraduacao;
	}

	public boolean getExtensao() {
		return this.extensao;
	}

	public void setExtensao(boolean extensao) {
		this.extensao = extensao;
	}

}
