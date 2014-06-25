package model;

import java.util.Date;

public class Issues{

	private String titulo;
	private String criticidade;
	private String descricao;
	
	private String tipo;
	private String status;

	
	public Issues(String titulo, String criticidade, String descricao,
			String tipo, String status) {
		super();
		this.titulo = titulo;
		this.criticidade = criticidade;
		this.descricao = descricao;
		this.tipo = tipo;
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCriticidade() {
		return criticidade;
	}
	public void setCriticidade(String criticidade) {
		this.criticidade = criticidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Issues "
				+ "\n[Titulo: " + titulo + ", "
				+ "\nCriticidade: " + criticidade
				+ "\nDescricao: " + descricao 
				+ "\nTipo: " + tipo 
				+ "\nStatus: "+ status + "]"
				+ "\n______________________________________";
	}
	


}