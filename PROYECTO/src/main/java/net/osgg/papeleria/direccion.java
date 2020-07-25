																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. G�mez (2020)
| File Date: Tue Jul 21 20:30:04 COT 2020
| 
 -------------------------------------------------------------------
																*/
package net.osgg.papeleria;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
	
@Entity
@Table(name = "direccion")
public class direccion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_direccion")
	private Long iddireccion;
	
	@Column(name = "id_cliente")
	private Long idcliente;
	
	
	@Column(name = "ciudad_direccion")	
	private String ciudaddireccion;
	
	@Basic
	@Column(name = "descripcion_direccion")
	private Date descripciondireccion;
	
	public Long getIddireccion() {
		return iddireccion;
	}
	
	public void setIddireccion(Long iddireccion) {
		this.iddireccion = iddireccion;
	}
	
	public Long getIdcliente() {
		return idcliente;
	}
	
	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}
	
	public String getCiudaddireccion() {
		return ciudaddireccion;
	}
	
	public void setCiudaddireccion(String ciudaddireccion) {
		this.ciudaddireccion = ciudaddireccion;
	}
	
	public Date getDescripciondireccion() {
		return descripciondireccion;
	}
	
	public void setDescripciondireccion(Date descripciondireccion) {
		this.descripciondireccion = descripciondireccion;
	}
	
}
