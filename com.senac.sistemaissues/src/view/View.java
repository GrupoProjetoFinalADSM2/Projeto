package view;
import java.util.*;
public class View {


Scanner leia = new Scanner(System.in);

public String login(){
System.out.println("Login:");
String login = leia.next();
return login;
}

public String senha(){
System.out.println("Senha:");
String senha = leia.next();
return senha;
}
public void mostraListaProjetos(){

}
public int menuProjetos(){
System.out.println("1 - Alterar:");
System.out.println("2 - Criar:");
System.out.println("3 - Excluir:");

int x = leia.nextInt();
return x;
}

public int listarIssues(){
System.out.println("1 - Listar por criticidade:");
System.out.println("2 - Listar por data de crica??o:");
System.out.println("3 - Criar nova Issue");

int y = leia.nextInt();
return y;

}
public int status(){

System.out.println("1 - Novo");
System.out.println("2 - Aberto");
System.out.println("3 - Em dev");
System.out.println("4 - Closed");
System.out.println("5 - Duplicado");
System.out.println("6 - Atribuido");
System.out.println("7 - wont' Fix");
int u = leia.nextInt();

return u;
}

public int criticidade(){
System.out.println("1 - Blocker");
System.out.println("2 - Critical");
System.out.println("3 - High");
System.out.println("4 - Medium");
System.out.println("5 - Low");
int w = leia.nextInt();
return w;

}
public int tipo(){
System.out.println("1 - Bug");
System.out.println("2 - Enhancement");
int v = leia.nextInt();
return v;

}



public int listarFiltrar(){
System.out.println("1 - Filtrar por tipo:");
System.out.println("2 - Filtrar por status:");
int z = leia.nextInt();
return z;
}
public int escolherIssueAdicionarEvento(){
return 0;


}

}