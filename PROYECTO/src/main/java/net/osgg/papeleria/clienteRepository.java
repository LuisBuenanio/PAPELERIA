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

import net.osgg.papeleria.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import javax.transaction.Transactional;

@Repository
public interface clienteRepository extends JpaRepository<cliente, Long> {

	Optional <cliente> findByIdcliente(Long idcliente);
	
	@Transactional
	void deleteByIdcliente(Long idcliente);
	
}
