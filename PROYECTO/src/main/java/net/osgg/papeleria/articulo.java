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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;	
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
	
@Entity
@Table(name = "articulo")
public class articulo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_articulo")
	private Long idarticulo;
	
	@Column(name = "id_pedido")
	private Long idpedido;
	
	@Column(name = "descripcion_articulo")
	private String descripcionarticulo;
	
	@Column(name = "cantidad_articulo")
	private Integer cantidadarticulo;
	
	@Column(name = "valor_articulo")
	private Double valorarticulo;
	
	@Column(name = "valortotal_articulo")
	private Double valortotalarticulo;
	
	public Long getIdarticulo() {
		return idarticulo;
	}
	
	public void setIdarticulo(Long idarticulo) {
		this.idarticulo = idarticulo;
	}
	
	public Long getIdpedido() {
		return idpedido;
	}
	
	public void setIdpedido(Long idpedido) {
		this.idpedido = idpedido;
	}
	
	public String getDescripcionarticulo() {
		return descripcionarticulo;
	}
	
	public void setDescripcionarticulo(String descripcionarticulo) {
		this.descripcionarticulo = descripcionarticulo;
	}
	
	public Integer getCantidadarticulo() {
		return cantidadarticulo;
	}
	
	public void setCantidadarticulo(Integer cantidadarticulo) {
		this.cantidadarticulo = cantidadarticulo;
	}
	
	public Double getValorarticulo() {
		return valorarticulo;
	}
	
	public void setValorarticulo(Double valorarticulo) {
		this.valorarticulo = valorarticulo;
	}
	
	public Double getValortotalarticulo() {
		return valortotalarticulo;
	}
	
	public void setValortotalarticulo(Double valortotalarticulo) {
		this.valortotalarticulo = valortotalarticulo;
	}
	
}
