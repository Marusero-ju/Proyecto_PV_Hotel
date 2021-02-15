package ar.edu.unju.edm.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Usuario;


@Repository
public interface IUsuarioRepository extends CrudRepository<Usuario, Integer> {
	public Optional<Usuario> findBynombreusuario(String nombreusuario);

	


	

}
