package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuarioRepository;



@Service
public class IUsuarioServiceImp implements IUsuarioServicie {
	@Autowired
	IUsuarioRepository iUsuarioRepository;

	@Override
	public void guardarUsuario(Usuario unUsuario) {
		// TODO Auto-generated method stub
		String pw= unUsuario.getPassword();
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		unUsuario.setPassword(bCryptPasswordEncoder.encode(pw));
		iUsuarioRepository.save(unUsuario);
	}

	@Override
	public Iterable<Usuario> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario editar(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public Object listarTodos() {
		// TODO Auto-generated method stub
		return iUsuarioRepository.findAll();
	}
	
	

}
