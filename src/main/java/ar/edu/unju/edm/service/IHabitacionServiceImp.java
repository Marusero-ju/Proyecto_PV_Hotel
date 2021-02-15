package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.HabitacionRepository;
@Service
public class IHabitacionServiceImp implements IHabitacionService {

	@Autowired
    HabitacionRepository pepe;
	
	@Override
	public void guardarHabitacion(Habitacion unaHabitacion) {
		// TODO Auto-generated method stub
		pepe.save(unaHabitacion);
		
	}

	@Override
	public Iterable<Habitacion> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Habitacion editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Habitacion> buscarHabitaciones() {
		// TODO Auto-generated method stub
		List<Habitacion> listadoHabitacion = (List<Habitacion>) pepe.findAll();
		return listadoHabitacion;
	}

}
