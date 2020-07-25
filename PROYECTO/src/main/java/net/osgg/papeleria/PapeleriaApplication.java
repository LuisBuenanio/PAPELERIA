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

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.TimeZone;
import javax.annotation.PostConstruct;					

@SpringBootApplication
public class PapeleriaApplication {
	public static void main(String[] args) {
		SpringApplication.run(PapeleriaApplication.class, args);
		System.out.println("Active resources for cliente entity");
		System.out.println("GET");
		System.out.println("/api/v1/cliente");
		System.out.println("/api/v1/cliente/{id}");
		System.out.println("POST");
		System.out.println("/api/v1/cliente");
		System.out.println("PUT");
		System.out.println("/api/v1/cliente");
		System.out.println("DELETE");
		System.out.println("/api/v1/cliente/{id}");
		System.out.println("Active resources for pedido entity");
		System.out.println("GET");
		System.out.println("/api/v1/pedido");
		System.out.println("/api/v1/pedido/{id}");
		System.out.println("POST");
		System.out.println("/api/v1/pedido");
		System.out.println("PUT");
		System.out.println("/api/v1/pedido");
		System.out.println("DELETE");
		System.out.println("/api/v1/pedido/{id}");
		System.out.println("Active resources for direccion entity");
		System.out.println("GET");
		System.out.println("/api/v1/direccion");
		System.out.println("/api/v1/direccion/{id}");
		System.out.println("POST");
		System.out.println("/api/v1/direccion");
		System.out.println("PUT");
		System.out.println("/api/v1/direccion");
		System.out.println("DELETE");
		System.out.println("/api/v1/direccion/{id}");
		System.out.println("Active resources for articulo entity");
		System.out.println("GET");
		System.out.println("/api/v1/articulo");
		System.out.println("/api/v1/articulo/{id}");
		System.out.println("POST");
		System.out.println("/api/v1/articulo");
		System.out.println("PUT");
		System.out.println("/api/v1/articulo");
		System.out.println("DELETE");
		System.out.println("/api/v1/articulo/{id}");
	}
	
	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("America/Guayaquil"));
	}						
}
