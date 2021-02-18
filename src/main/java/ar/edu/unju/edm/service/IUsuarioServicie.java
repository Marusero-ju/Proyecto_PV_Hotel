package ar.edu.unju.edm.service;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;



@Service
public interface IUsuarioServicie {

	public void guardarUsuario(Usuario unUsuario);
	public Iterable<Usuario> listar();
	public void delete(Integer id);
	public Usuario editar(Integer id) throws Exception;
	public Object findByNombreUsuario(String nombreUsuario);
}
