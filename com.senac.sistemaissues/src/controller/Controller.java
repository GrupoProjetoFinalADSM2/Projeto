package controller;



import structure.Lista2;
import structure.Lista1;
import structure.No;
import view.View_Issues;
import view.View_Login;
import view.View_Projetos;
import model.Eventos;
import model.Issues;
import model.Projetos;
import model.Usuarios;

public class Controller {

	
	View_Projetos view1 = new View_Projetos();
	View_Issues view2 = new View_Issues();
	View_Login view3 = new View_Login();

	
	Lista2 listaUser = new Lista2();
	Lista2 listaProjetos = new Lista2();
	Lista2 listaIssues = new Lista2();
	
	
	
	
	
	//______________________________________________________
	public void login(){
		
				String user = view3.login();
				String login = view3.CadastrarUsuario();
				String senha = view3.CadastrarSenha();
				
				Usuarios user1 = new Usuarios(login, senha);
				listaUser.inserirNoInicio(new No(user1));
	
	}
	//______________________________________________________
	public void mostraListaDeProjetos(){
		listaProjetos.exibirLista();
	}
	//______________________________________________________
	public void menuAlterarCriarExcluir(){
		Controller altera = new Controller();
		
		int x = view1.menuProjetos();
		
		switch(x){
		case 1: String nome_AlterarProjeto = view1.alterarProjeto();
				altera.alterarProjeto(nome_AlterarProjeto);
		break;
		case 2: altera.criarProjeto();
				
		break;
		case 3: String nome_excluirProjeto = view1.excluirProjeto();  	
		break;
		
		}
	}
	//______________________________________________________
	public void alterarProjeto(String nome_n){
		
		Controller c = new Controller(); 
		
		String nome_novo = view1.criarProjeto();
		String descricao = view1.descricaoProjeto();
		String criador = view1.criadorProjeto();
		String desenvolvedor = view1.desenvolvedoresProjeto();
		
		Projetos p = new Projetos(nome_novo, descricao, criador, desenvolvedor);
		
		listaProjetos.inserirNoInicio(new No(p));
		
		
		listaProjetos.exibirLista();	
		
			
		}
	//______________________________________________________
	public void criarProjeto(){
		
		Controller c = new Controller(); 
		
		String nome_novo = view1.criarProjeto();
		String descricao = view1.descricaoProjeto();
		String criador = view1.criadorProjeto();
		String desenvolvedor = view1.desenvolvedoresProjeto();
		
		Projetos p = new Projetos(nome_novo, descricao, criador, desenvolvedor);
		
		listaProjetos.inserirNoInicio(new No(p));
		 
		
		
		listaProjetos.exibirLista();
		
	}
	//______________________________________________________
	public void criarIssues(){
		Controller c = new Controller(); 
		
		String titulo = view2.adicionarIssues();
		String criticidade = view2.informeCriticidadeIssue();
		String descricao = view2.descricaoIssues();
		String status = view2.issuesStatus();
		String tipo = view2.issuesTipo();
		
		Issues issues = new Issues(titulo, criticidade, descricao, tipo , status);
		
		listaIssues.inserirNoInicio(new No(issues));
		
		listaProjetos.exibirLista();
		//listaIssues.exibirLista();
	}
}


















