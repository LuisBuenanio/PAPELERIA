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

import net.osgg.papeleria.articulo;
import net.osgg.papeleria.RecordNotFoundException;
import net.osgg.papeleria.articuloRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class articuloService {

	@Autowired
	articuloRepository repo;

	public List<articulo> getAll(){
		List<articulo> articuloList = repo.findAll();
		if(articuloList.size() > 0) {
			return articuloList;
		} else {
			return new ArrayList<articulo>();
		}
	}
     		
	public articulo findByIdarticulo(Long idarticulo) throws RecordNotFoundException{
		Optional<articulo> articulo = repo.findByIdarticulo(idarticulo);
		if(articulo.isPresent()) {
			return articulo.get();
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public articulo createarticulo(articulo articulo){
		return repo.save(articulo);
	}

	public articulo updatearticulo(articulo articulo) throws RecordNotFoundException {
		Optional<articulo> articuloTemp = repo.findByIdarticulo(articulo.getIdarticulo());
	
		if(articuloTemp.isPresent()){
			return repo.save(articulo);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}

	public void deletearticuloByIdarticulo(Long idarticulo) throws RecordNotFoundException{
		Optional<articulo> articulo = repo.findByIdarticulo(idarticulo);
		if(articulo.isPresent()) {
		repo.deleteByIdarticulo(idarticulo);
		} else {
			throw new RecordNotFoundException("Record does not exist for the given Id");
		}
	}		

}
