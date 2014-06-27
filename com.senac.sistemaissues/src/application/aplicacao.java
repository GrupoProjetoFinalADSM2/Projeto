package application;

import controller.Controller;
import structure.Lista1;
import structure.Lista2;
import structure.No;

public class Aplicacao {

	public static void main(String[] args) {


		
		Controller vai = new Controller();
		int x = 0;
		int cont = 0;
		while(x<10){
			vai.login();
			vai.menuAlterarCriarExcluir();
		cont++;
		}
	}

}
