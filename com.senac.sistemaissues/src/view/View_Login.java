package view;

import java.util.Scanner;

public class View_Login {
	
	Scanner leia = new Scanner(System.in);
	
	public String login(){
		System.out.println("Login:");
		String login = leia.next();
		return login;
	}
//______________________________________________________ 
	public String senha(){
		System.out.println("Senha:");
		String senha = leia.next();
		return senha;
	}
//______________________________________________________ 
	public String CadastrarUsuario(){
		System.out.println("Novo usuario informe o login:");
		String novoLogin = leia.next();
		return novoLogin;
	}
//______________________________________________________ 
	public String CadastrarSenha(){
		System.out.println("informe nova senha:");
		String novaSenha = leia.next();
		return novaSenha;
	}
}
