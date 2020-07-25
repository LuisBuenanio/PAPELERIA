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

import net.osgg.papeleria.direccion;
import net.osgg.papeleria.RecordNotFoundException;
import net.osgg.papeleria.direccionRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class direccionService {

	@Autowired
	direccionRepository repo;

	public List<direccion> getAll(){
		List<direccion> direccionList = repo.findAll();
		if(direccionList.size() > 0) {
			return direccionList;
		} else {
			return new ArrayList<direccion>();
		}
	}
     		
	public direccion findByIddireccion(Long iddireccion) throws RecordNotFoundException{
		Optional<direccion> direccion = repo.findByIddireccion(iddireccion);
		if(direccion.isPresent()) {
			return direccion.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public direccion createdireccion(direccion direccion){
		return repo.save(direccion);
	}

	public direccion updatedireccion(direccion direccion) throws RecordNotFoundException {
		Optional<direccion> direccionTemp = repo.findByIddireccion(direccion.getIddireccion());
	
		if(direccionTemp.isPresent()){
			return repo.save(direccion);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletedireccionByIddireccion(Long iddireccion) throws RecordNotFoundException{
		Optional<direccion> direccion = repo.findByIddireccion(iddireccion);
		if(direccion.isPresent()) {
		repo.deleteByIddireccion(iddireccion);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
