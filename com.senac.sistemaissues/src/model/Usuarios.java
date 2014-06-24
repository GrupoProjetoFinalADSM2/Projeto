package model;

public class Usuarios{
	
	//private String nome;
	private String username;
	private String senha;
	
	public Usuarios() {
		super();
		//this.nome = nome;
		this.username = username;
		this.senha = senha;
	}
	
	

	
	public Usuarios(String username, String senha) {
		super();
		//this.nome = nome;
		this.username = username;
		this.senha = senha;
	}

//	public String getNome() {
//		return nome;
//	}
//
//	public void setNome(String nome) {
//		this.nome = nome;
//	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
	
	
	

}
