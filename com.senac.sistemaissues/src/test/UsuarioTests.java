package test;

import static org.junit.Assert.*;

import model.Usuarios;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.View;

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
		usuario.setSenha(123456);
		assertTrue(usuario.getSenha() == 123456);
		
	}
	
	@Test
	public void testaLogin() {
		Usuarios user = new Usuarios ();
		View view = new View ();
		user.setNome("Joao");
		view.entraDados();
		assertTrue(user.equals(view.entraDados()));
		
	}

}
