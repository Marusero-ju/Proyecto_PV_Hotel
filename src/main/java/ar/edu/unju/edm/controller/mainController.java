package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.model.Reserva;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IUsuarioServiceImp;


@Controller
@RequestMapping("/home")
public class mainController {
	
	@Autowired
	IHabitacionService habitacionservice;
	
	@GetMapping({"/","/login"})
	public String ingresar(Model model) {
		return "login";
	}

	
	@Autowired
	private IUsuarioServiceImp usuarioService; 
		
		@GetMapping("/altausuario")
		public ModelAndView getform() {
			return new ModelAndView("usuario").addObject("usuario", new Usuario());
		}
		
		
		
		@GetMapping("/altahabitacion")
		public ModelAndView getformhabitacion() {
			return new ModelAndView("habitacion").addObject("habitacion", new Habitacion());
		}
				
	
		@GetMapping("/altareserva")
		public ModelAndView getformreserva() {
			ModelAndView model = new ModelAndView("reserva");
			model.addObject("reserva", new Reserva());
			model.addObject("listadohabitaciones", habitacionservice.buscarHabitaciones());
			return model;
		}

		
		@GetMapping("/formulario")
		public String cargarFormulario(Model model) {
			model.addAttribute("usuarioDelForm", new Usuario());
			model.addAttribute("listaUsuarios", usuarioService.listarTodos());
			model.addAttribute("formTap","active");
			return "usuarioForm";
		}
		
		
}
