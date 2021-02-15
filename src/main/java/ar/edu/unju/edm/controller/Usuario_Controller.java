package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IUsuarioServicie;

@Controller
@RequestMapping("/usuario")
public class Usuario_Controller {
	
	@Autowired
	IUsuarioServicie IUsuarioServicie;

	@PostMapping("/saveUsuario")
	public String saveUsuario(Usuario usuario, Model model ) {
		
		IUsuarioServicie.guardarUsuario(usuario);
		 
		return "usuario";
	}
	
}
