package ar.edu.unju.edm.repository;

import java.time.LocalDate;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Reserva;



@Repository
public interface IReservaRepository extends CrudRepository<Reserva, Integer> {
	public Iterable<Reserva> findByClienteNombreusuario(String nombreusuario);
	public Iterable<Reserva> findByFecha(LocalDate fecha);
}
