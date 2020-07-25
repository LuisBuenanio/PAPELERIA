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
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;



import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "cliente")
public class cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cliente")
	private Long idcliente;
	
	@Column(name = "ci_cliente")
	private String cicliente;
	
	@Column(name = "nombre_cliente")
	private String nombrecliente;
	
	@Column(name = "apellido_cliente")
	private String apellidocliente;
	
	@Column(name = "correo_cliente")
	private String correocliente;
	
	@Column(name = "telefono_cliente")
	private String telefonocliente;
		
	public Long getIdcliente() {
		return idcliente;
	}
	
	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}
	
	public String getCicliente() {
		return cicliente;
	}
	
	public void setCicliente(String cicliente) {
		this.cicliente = cicliente;
	}
	
	public String getNombrecliente() {
		return nombrecliente;
	}
	
	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}
	
	public String getApellidocliente() {
		return apellidocliente;
	}
	
	public void setApellidocliente(String apellidocliente) {
		this.apellidocliente = apellidocliente;
	}
	
	public String getCorreocliente() {
		return correocliente;
	}
	
	public void setCorreocliente(String correocliente) {
		this.correocliente = correocliente;
	}
	
	public String getTelefonocliente() {
		return telefonocliente;
	}
	
	public void setTelefonocliente(String telefonocliente) {
		this.telefonocliente = telefonocliente;
	}
	
}
