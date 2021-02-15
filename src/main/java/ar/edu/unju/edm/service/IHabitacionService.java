package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;


@Service
public interface IHabitacionService {
	public void guardarHabitacion(Habitacion unaHabitacion);
	public Iterable<Habitacion> listar();
	public void delete(Integer id);
	public Habitacion editar(Integer id) throws Exception;
	public List<Habitacion> buscarHabitaciones();

}
