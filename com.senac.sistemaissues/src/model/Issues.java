package model;

import java.util.Date;

public class Issues {

	private String titulo;
	private String[] criticidade;
	private String descricao;
	private Date dataCriacao;
	private String[] tipo;
	private String[] status;


	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String[] getCriticidade() {
		return criticidade;
	}
	public void setCriticidade(String[] criticidade) {
		this.criticidade = criticidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String[] getTipo() {
		return tipo;
	}
	public void setTipo(String[] tipo) {
		this.tipo = tipo;
	}
	public String[] getStatus() {
		return status;
	}
	public void setStatus(String[] status) {
		this.status = status;
	}



}