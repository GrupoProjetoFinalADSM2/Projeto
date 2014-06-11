package controller;

import structure.Lista;
import structure.No;
import view.View;
import model.Usuarios;

public class Controller {
	
	Usuarios user1 = new Usuarios ();
	View view1 = new View ();
	Lista listaUsers = new Lista ();
	
	public String verificaUserExistente () {
		if (view1.login().equals(listaUsers.exibirLista());
			
		} else {
		listaUsers.inserirNoInicio(new No(view1.login()));
		}
		
	}

}
