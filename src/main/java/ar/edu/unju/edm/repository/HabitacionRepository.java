package ar.edu.unju.edm.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Habitacion;


@Repository
public interface HabitacionRepository extends CrudRepository<Habitacion, Integer> {

}
