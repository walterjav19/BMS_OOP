package com.laserants.Book_Inventory_api.services;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.laserants.Book_Inventory_api.repositories.IAuthorRepository;

@Service
public class AuthorService {
	//Inyeccion de Dependencias
	@Autowired
	private IAuthorRepository authorRepository;
	
	
	// obtiene todos los autores
	public ResponseEntity getAuthors() {
		return new ResponseEntity(authorRepository.findAll(), HttpStatus.OK);
	}
}
