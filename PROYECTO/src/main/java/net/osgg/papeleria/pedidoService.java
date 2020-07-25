																/*
 -------------------------------------------------------------------
|
| CRUDyLeaf	- A Domain Specific Language for generating Spring Boot 
|			REST resources from entity CRUD operations.
| Author: Omar S. Gómez (2020)
| File Date: Tue Jul 21 20:30:05 COT 2020
| 
 -------------------------------------------------------------------
																*/
package net.osgg.papeleria;

import net.osgg.papeleria.pedido;
import net.osgg.papeleria.RecordNotFoundException;
import net.osgg.papeleria.pedidoRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class pedidoService {

	@Autowired
	pedidoRepository repo;

	public List<pedido> getAll(){
		List<pedido> pedidoList = repo.findAll();
		if(pedidoList.size() > 0) {
			return pedidoList;
		} else {
			return new ArrayList<pedido>();
		}
	}
     		
	public pedido findByIdpedido(Long idpedido) throws RecordNotFoundException{
		Optional<pedido> pedido = repo.findByIdpedido(idpedido);
		if(pedido.isPresent()) {
			return pedido.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public pedido createpedido(pedido pedido){
		return repo.save(pedido);
	}

	public pedido updatepedido(pedido pedido) throws RecordNotFoundException {
		Optional<pedido> pedidoTemp = repo.findByIdpedido(pedido.getIdpedido());
	
		if(pedidoTemp.isPresent()){
			return repo.save(pedido);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletepedidoByIdpedido(Long idpedido) throws RecordNotFoundException{
		Optional<pedido> pedido = repo.findByIdpedido(idpedido);
		if(pedido.isPresent()) {
		repo.deleteByIdpedido(idpedido);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
