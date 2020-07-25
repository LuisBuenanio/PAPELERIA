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
import net.osgg.papeleria.pedidoService;
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
public class pedidoController {
	@Autowired
	pedidoService service;
	
	@GetMapping("/pedido")
	public ResponseEntity<List<pedido>> getAll() {
		List<pedido> list = service.getAll();
		return new ResponseEntity<List<pedido>>(list, new HttpHeaders(), HttpStatus.OK);
	}

	@GetMapping("/pedido/{id}")
	public ResponseEntity<pedido> getpedidoByIdpedido(@PathVariable("id") Long idpedido) throws RecordNotFoundException {
		pedido entity = service.findByIdpedido(idpedido);
		return new ResponseEntity<pedido>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@PostMapping("/pedido")
	public ResponseEntity<pedido> createpedido(@RequestBody pedido pedido){
		service.createpedido(pedido);
		return new ResponseEntity<pedido>(pedido, new HttpHeaders(), HttpStatus.OK);
	}

	@PutMapping("/pedido")
	public ResponseEntity<pedido> updatepedido(@RequestBody pedido pedido) throws RecordNotFoundException{
		service.updatepedido(pedido);
		return new ResponseEntity<pedido>(pedido, new HttpHeaders(), HttpStatus.OK);
	}

	@DeleteMapping("/pedido/{id}")
	public HttpStatus deletepedidoByIdpedido(@PathVariable("id") Long idpedido) throws RecordNotFoundException {
		service.deletepedidoByIdpedido(idpedido);
		return HttpStatus.OK;
	}
}				
