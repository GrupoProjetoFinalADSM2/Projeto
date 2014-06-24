package view;
import java.util.*;

public class View_Projetos {
	
	Scanner leia = new Scanner(System.in);

	public void mostraListaProjetos(String lista){
		System.out.println(lista);
	}
//______________________________________________________
	public void mostraListaIssues(Object lista){
		System.out.println(lista);
	}
//______________________________________________________
	public int menuProjetos(){
		System.out.println("1 - Alterar:");
		System.out.println("2 - Criar:");
		System.out.println("3 - Excluir:");
		int x = leia.nextInt();
		return x;
	}
//______________________________________________________
	public String alterarProjeto(){
		System.out.println("Informe o nome do projeto:");
		String nomeProjeto = leia.next();
		return nomeProjeto;
	}
//______________________________________________________
	public String descricaoProjeto(){
		System.out.println("Informe a descrição do projeto:");
		String descricaoProjeto = leia.next();
		return descricaoProjeto;
	}
//______________________________________________________
	public String criadorProjeto(){
		System.out.println("Informe o criador do projeto:");
		String criadorProjeto = leia.next();
		return criadorProjeto;
	}
//______________________________________________________
	public String desenvolvedoresProjeto(){
		System.out.println("Informe novo desenvolvedor do projeto:");
		String desenvolvedorProjeto = leia.next();
		return desenvolvedorProjeto;
	}
//______________________________________________________
	public String criarProjeto(){
		System.out.println("Informe o nome do novo Projeto:");
		String novoProjeto = leia.next();
		return novoProjeto;
	}
//______________________________________________________
	public String excluirProjeto(){
		System.out.println("Informe o nome do projeto para excluir:");
		String excluirProjeto = leia.next();
		return excluirProjeto;
	}

}













