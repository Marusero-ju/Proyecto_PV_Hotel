package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Reserva;

@Service 
public interface IReservaService {
	public void guardarReserva(Reserva unaReserva);
	public Iterable<Reserva> listar();
	public void delete(Integer id);
	public Reserva editar(Integer id) throws Exception;

}
