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
import net.osgg.papeleria.articuloService;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;	
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
@RestController
@RequestMapping("/api/v1")
public class articuloController {
	@Autowired
	articuloService service;
	
	@GetMapping("/articulo")
	public ResponseEntity<List<articulo>> getAll() {
		List<articulo> list = service.getAll();
		return new ResponseEntity<List<articulo>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/articulo/{id}")
	public ResponseEntity<articulo> getarticuloByIdarticulo(@PathVariable("id") Long idarticulo) throws RecordNotFoundException {
		articulo entity = service.findByIdarticulo(idarticulo);
		return new ResponseEntity<articulo>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/articulo")
	public ResponseEntity<articulo> createarticulo(@RequestBody articulo articulo){
		service.createarticulo(articulo);
		return new ResponseEntity<articulo>(articulo, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/articulo")
	public ResponseEntity<articulo> updatearticulo(@RequestBody articulo articulo) throws RecordNotFoundException{
		service.updatearticulo(articulo);
		return new ResponseEntity<articulo>(articulo, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/articulo/{id}")
	public HttpStatus deletearticuloByIdarticulo(@PathVariable("id") Long idarticulo) throws RecordNotFoundException {
		service.deletearticuloByIdarticulo(idarticulo);
		return HttpStatus.OK;
	}
}				
