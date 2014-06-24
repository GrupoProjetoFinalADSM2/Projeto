package application;

import controller.Controller;
import structure.Lista1;
import structure.Lista2;
import structure.No;

public class Aplicacao {

	public static void main(String[] args) {


		
		Controller vai = new Controller();
		
		vai.login();
		vai.mostraListaDeProjetos();
		vai.menuAlterarCriarExcluir();
		
	}

}
