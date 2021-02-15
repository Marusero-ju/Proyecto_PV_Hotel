package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.edm.model.Reserva;

import ar.edu.unju.edm.service.IReservaServiceImp;

@Controller
@RequestMapping("/reserva")
public class Controller_Reserva {
		
	@Autowired
	IReservaServiceImp IReservaService;
	
	@PostMapping("/saveReserva")
	public String saveReseva(Reserva reserva, Model model ) {
		
		IReservaService.guardarReserva(reserva);
		 
		return "reserva";
	}
	@PostMapping("/listadoReserva")
	public String mostrarListado() {
		return "reserva";
	}
	
	
}
