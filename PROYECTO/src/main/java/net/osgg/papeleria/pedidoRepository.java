																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. G�mez (2020)
| File Date: Tue Jul 21 20:30:05 COT 2020
| 
 -------------------------------------------------------------------
																*/
package net.osgg.papeleria;

import net.osgg.papeleria.pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface pedidoRepository extends JpaRepository<pedido, Long> {

	Optional <pedido> findByIdpedido(Long idpedido);
	
	@Transactional
	void deleteByIdpedido(Long idpedido);
	
}
