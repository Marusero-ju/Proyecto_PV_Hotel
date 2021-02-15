package ar.edu.unju.edm.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Reserva;


@Repository
public interface IReservaRepository extends CrudRepository<Reserva, Integer> {
	
}
