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
import javax.persistence.FetchType;
import javax.persistence.Table;



import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
	
@Entity
@Table(name = "pedido")
public class pedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pedido")
	private Long idpedido;
	
	@Column(name = "id_cliente")
	private Long idcliente;
	
	@Column(name = "no_pedido")
	private String nopedido;
	
	@Column(name = "descripcion_pedido")
	private String descripcionpedido;
	
	@Column(name = "estado_pedido")
	private String estadopedido;
	
	@Basic
	@Column(name = "fecha_pedido")
	private Date fechapedido;
	
	@Column(name = "precio_pedido")
	private Double precio;

	public Long getIdpedido() {
		return idpedido;
	}
	
	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}
	
	public Long getIdcliente() {
		return idcliente;
	}
	
	public void setIdcliente(Long idcliente) {
		this.idcliente = idcliente;
	}
	
	public String getNopedido() {
		return nopedido;
	}
	
	public void setNopedido(String nopedido) {
		this.nopedido = nopedido;
	}
	
	public String getDescripcionpedido() {
		return descripcionpedido;
	}
	
	public void setDescripcionpedido(String descripcionpedido) {
		this.descripcionpedido = descripcionpedido;
	}
	
	public String getEstadopedido() {
		return estadopedido;
	}
	
	public void setEstadopedido(String estadopedido) {
		this.estadopedido = estadopedido;
	}
	
	public Date getFechapedido() {
		return fechapedido;
	}
	
	public void setFechapedido(Date fechapedido) {
		this.fechapedido = fechapedido;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
}
