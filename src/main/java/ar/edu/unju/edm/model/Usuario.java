package ar.edu.unju.edm.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;
@Component
@Entity
public class Usuario implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer idUsuario;
	@Column
	private long dni;
	@Column
	private String password;
	@Column
	private String apellido;
	@Column
	private String nombreusuario;
	@Column
	private String nombrereal;
	@Column
	private String tipoUsuario;
	
		
		
	public Usuario(Integer idUsuario, long dni, String password, String apellido, String nombreusuario,
			String nombrereal, String tipoUsuario) {
		super();
		this.idUsuario = idUsuario;
		this.dni = dni;
		this.password = password;
		this.apellido = apellido;
		this.nombreusuario = nombreusuario;
		this.nombrereal = nombrereal;
		this.tipoUsuario = tipoUsuario;
	}
	public long getDni() {
		return dni;
	}
	public void setDni(long dni) {
		this.dni = dni;
	}
	public String getNombreusuario() {
		return nombreusuario;
	}
	public void setNombreusuario(String nombreusuario) {
		this.nombreusuario = nombreusuario;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
		
	public Integer getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}
		
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	
	
	public String getNombrereal() {
		return nombrereal;
	}
	public void setNombrereal(String nombrereal) {
		this.nombrereal = nombrereal;
	}
	public Usuario() {
		super();
	}
	public String getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getContraseña() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getNombreUsuario() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
		
	

}
