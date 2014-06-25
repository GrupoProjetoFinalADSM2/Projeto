package model;

public class Projetos {
	
	private String nome;
	private String descricao;
	private String criador;
	private String desenvolvedores;

	
	public Projetos(String nome, String descricao, String criador,
			String desenvolvedores) {
		
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.criador = criador;
		this.desenvolvedores = desenvolvedores;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCriador() {
		return criador;
	}
	public void setCriador(String criador) {
		this.criador = criador;
	}
	public String getDesenvolvedores() {
		return desenvolvedores;
	}
	public void setDesenvolvedores(String desenvolvedores) {
		this.desenvolvedores = desenvolvedores;
	}
	@Override
	public String toString() {
		return "Projetos\n[Nome: " + nome + ""
				+ "\nDescricao: " + descricao
				+ "\nCriador: " + criador 
				+ "\nDesenvolvedores: "+ desenvolvedores + "]"
				+ "\n______________________________________";
	}
	


}