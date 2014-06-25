package view;

import java.util.Scanner;

public class View_Issues {
	
	Scanner leia = new Scanner(System.in);
	
		public int listarIssues(){
			System.out.println("1 - Listar por criticidade:");
			System.out.println("2 - Listar por data de cricacao:");
			System.out.println("3 - Criar nova Issue");
			int y = leia.nextInt();
			return y;
			}
	//______________________________________________________
		public String adicionarIssues(){
			System.out.println("informe o nome da nova Issue:");
			String novaIssue = leia.next();
			return novaIssue;
		}
	//______________________________________________________
		public String informeCriticidadeIssue(){
			
			System.out.println("Escreva a criticidade da Issue por extenso:");
			System.out.println("1 - Blocker");
			System.out.println("2 - Critical");
			System.out.println("3 - High");
			System.out.println("4 - Medium");
			System.out.println("5 - Low");
			String w = leia.next();
			return w;
		}
	//______________________________________________________
		public String descricaoIssues(){
			System.out.println("Informe a descricao da Issues:");
			String descricaoIssues = leia.next();
			return descricaoIssues;
		}
	//______________________________________________________
		
		public String issuesStatus(){
			System.out.println("Escreva o status por extenso:");
			System.out.println("1 - Novo");
			System.out.println("2 - Aberto");
			System.out.println("3 - Em dev");
			System.out.println("4 - Closed");
			System.out.println("5 - Duplicado");
			System.out.println("6 - Atribuido");
			System.out.println("7 - wont' Fix");
			String u = leia.next();
			return u;
		}
	//______________________________________________________  
		public String issuesTipo(){
			System.out.println("Escreva o tipo por extenso:");
			System.out.println("1 - Bug");
			System.out.println("2 - Enhancement");
			String v = leia.next();
			return v;
		}
	//______________________________________________________ 
		public int listarFiltrar(){
			System.out.println("1 - Filtrar por tipo:");
			System.out.println("2 - Filtrar por status:");
			int z = leia.nextInt();
			return z;
		}
	//______________________________________________________  
		public int escolherIssueAdicionarEvento(){
			
			return 0;
		}
	//______________________________________________________  
}
