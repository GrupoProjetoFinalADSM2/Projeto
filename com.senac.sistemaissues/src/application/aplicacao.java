package application;

import controller.Controller;
import structure.Lista1;
import structure.Lista2;
import structure.No;

public class Aplicacao {

	public static void main(String[] args) {

//		Lista1 teste = new Lista1();
//		Lista2 teste2 = new Lista2();
// 		
//		System.out.println("Lista 1 ____________________");
//		teste.adicionaNoComeco("Nome");
//		teste.adicionaNoComeco("Nome2");
//		System.out.println(teste);
//		System.out.println(teste.contem("Nome"));
//		
//		
//		System.out.println("Lista 2 ____________________");
//		teste2.exibirLista();
		
		Controller vai = new Controller();
		
		vai.login();
		vai.mostraListaDeProjetos();
		vai.menuAlterarCriarExcluir();
		
	}

}
