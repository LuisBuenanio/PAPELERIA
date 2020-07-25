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
import net.osgg.papeleria.direccionService;
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
public class direccionController {
	@Autowired
	direccionService service;
	
	@GetMapping("/direccion")
	public ResponseEntity<List<direccion>> getAll() {
		List<direccion> list = service.getAll();
		return new ResponseEntity<List<direccion>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/direccion/{id}")
	public ResponseEntity<direccion> getdireccionByIddireccion(@PathVariable("id") Long iddireccion) throws RecordNotFoundException {
		direccion entity = service.findByIddireccion(iddireccion);
		return new ResponseEntity<direccion>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/direccion")
	public ResponseEntity<direccion> createdireccion(@RequestBody direccion direccion){
		service.createdireccion(direccion);
		return new ResponseEntity<direccion>(direccion, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/direccion")
	public ResponseEntity<direccion> updatedireccion(@RequestBody direccion direccion) throws RecordNotFoundException{
		service.updatedireccion(direccion);
		return new ResponseEntity<direccion>(direccion, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/direccion/{id}")
	public HttpStatus deletedireccionByIddireccion(@PathVariable("id") Long iddireccion) throws RecordNotFoundException {
		service.deletedireccionByIddireccion(iddireccion);
		return HttpStatus.OK;
	}
}				
