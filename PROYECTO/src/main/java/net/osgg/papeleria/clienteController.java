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

import net.osgg.papeleria.cliente;
import net.osgg.papeleria.RecordNotFoundException;
import net.osgg.papeleria.clienteService;
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
public class clienteController {
	@Autowired
	clienteService service;
	
	@GetMapping("/cliente")
	public ResponseEntity<List<cliente>> getAll() {
		List<cliente> list = service.getAll();
		return new ResponseEntity<List<cliente>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/cliente/{id}")
	public ResponseEntity<cliente> getclienteByIdcliente(@PathVariable("id") Long idcliente) throws RecordNotFoundException {
		cliente entity = service.findByIdcliente(idcliente);
		return new ResponseEntity<cliente>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/cliente")
	public ResponseEntity<cliente> createcliente(@RequestBody cliente cliente){
		service.createcliente(cliente);
		return new ResponseEntity<cliente>(cliente, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/cliente")
	public ResponseEntity<cliente> updatecliente(@RequestBody cliente cliente) throws RecordNotFoundException{
		service.updatecliente(cliente);
		return new ResponseEntity<cliente>(cliente, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/cliente/{id}")
	public HttpStatus deleteclienteByIdcliente(@PathVariable("id") Long idcliente) throws RecordNotFoundException {
		service.deleteclienteByIdcliente(idcliente);
		return HttpStatus.OK;
	}
}				
