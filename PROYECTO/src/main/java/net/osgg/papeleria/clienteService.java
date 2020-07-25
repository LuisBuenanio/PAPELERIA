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

import net.osgg.papeleria.cliente;
import net.osgg.papeleria.RecordNotFoundException;
import net.osgg.papeleria.clienteRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class clienteService {

	@Autowired
	clienteRepository repo;
	
	@Autowired
	pedidoRepository repopedido;
	

	public List<cliente> getAll(){
		List<cliente> clienteList = repo.findAll();
		if(clienteList.size() > 0) {
			return clienteList;
		} else {
			return new ArrayList<cliente>();
		}
	}
     		
	public cliente findByIdcliente(Long idcliente) throws RecordNotFoundException{
		Optional<cliente> cliente = repo.findByIdcliente(idcliente);
		if(cliente.isPresent()) {
			return cliente.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public cliente createcliente(cliente cliente){
		return repo.save(cliente);
	}

	public cliente updatecliente(cliente cliente) throws RecordNotFoundException {
		Optional<cliente> clienteTemp = repo.findByIdcliente(cliente.getIdcliente());
	
		if(clienteTemp.isPresent()){
			return repo.save(cliente);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deleteclienteByIdcliente(Long idcliente) throws RecordNotFoundException{
		Optional<cliente> cliente = repo.findByIdcliente(idcliente);
		if(cliente.isPresent()) {
		repo.deleteByIdcliente(idcliente);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
