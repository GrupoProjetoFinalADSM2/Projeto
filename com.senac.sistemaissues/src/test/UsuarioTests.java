package test;

import static org.junit.Assert.*;
import model.Usuarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import structure.Lista1;
import structure.Lista2;
import structure.No;
import view.View_Login;
import view.View_Projetos;

public class UsuarioTests {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testaCriacaoUsuario() {
		Usuarios usuario = new Usuarios ();
		usuario.setSenha("123456");
		assertTrue(usuario.getSenha() == "123456");
		
	}
	
//	@Test
//	public void testaLista() {
//		Lista2 lista = new Lista2 ();
//		No nodo = new No (lista);
//		lista.inserirNoInicio(nodo);
//		
//		
//		
//	}
	
	@Test
	public void testaLogin() {
		Usuarios user = new Usuarios ();
		View_Login view = new View_Login ();
		user.setUsername("Joao");
		view.login();
		assertTrue(user.equals(view.login()));
		
	}

}
