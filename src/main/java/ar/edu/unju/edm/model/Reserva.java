package ar.edu.unju.edm.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Reserva {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")
	@GenericGenerator(name="native",strategy="native")
	private Integer idReserva;
	@Column
	@DateTimeFormat(pattern="dd/MM/yyyy")
	private LocalDate fecha;
	@Column
	private String desayuno;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario_id")
	private Usuario cliente;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "reserva_habitacion", 
	 joinColumns = @JoinColumn(name = "reserva_id"), 
	 inverseJoinColumns = @JoinColumn(name = "habitacion_id"))
	private List<Habitacion> listadohabitacion;


	
	public Reserva(Integer idReserva, LocalDate fecha, String desayuno, Usuario cliente,
			List<Habitacion> listadohabitacion) {
		super();
		this.idReserva = idReserva;
		this.fecha = fecha;
		this.desayuno = desayuno;
		this.cliente = cliente;
		this.listadohabitacion = listadohabitacion;
	}


	public Reserva() {
		super();
	}


	public Integer getIdReserva() {
		return idReserva;
	}


	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public String getDesayuno() {
		return desayuno;
	}


	public void setDesayuno(String desayuno) {
		this.desayuno = desayuno;
	}


	public Usuario getCliente() {
		return cliente;
	}


	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}


	public List<Habitacion> getListadohabitacion() {
		return listadohabitacion;
	}


	public void setListadohabitacion(List<Habitacion> listadohabitacion) {
		this.listadohabitacion = listadohabitacion;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
	
}
