package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Reserva;

import ar.edu.unju.edm.service.IHabitacionService;
import ar.edu.unju.edm.service.IReservaServiceImp;

@Controller
@RequestMapping("/reserva")
public class Controller_Reserva {
		
	@Autowired
	IReservaServiceImp IReservaService;
	@Autowired
	IHabitacionService habitacionService;
	
	@PostMapping("/saveReserva")
	public String saveReseva(Reserva reserva, Model model ) {
		
		IReservaService.guardarReserva(reserva);
		return "formulario";
	}
	@PostMapping("/listadoReserva")
	public String mostrarListado() {
		return "listado reserva";
	}
	
	@GetMapping ("/formularioReserva")
	public String formReserva() {
		
		return "reserva";
	}	
	
	@GetMapping("/formReserva")
	public ModelAndView getformreserva() {
		ModelAndView model = new ModelAndView("reserva");
		model.addObject("reserva", new Reserva());
		model.addObject("listadohabitaciones", habitacionService.buscarHabitaciones());
		return model;
	}
	
}
