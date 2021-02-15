package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.service.IHabitacionService;

@Controller
@RequestMapping("/Habitacion")
public class Habitacion_Controller {

	@Autowired
	IHabitacionService IHabitacionService;
	
	@PostMapping("/saveHabitacion")
	public String saveUsuario(Habitacion habitacion, Model model ) {
		
		IHabitacionService.guardarHabitacion(habitacion);
		 
		return "habitacion";
}


}