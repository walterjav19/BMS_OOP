package com.laserants.Book_Inventory_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.laserants.Book_Inventory_api.repositories.IBookRepository;

@Service
public class BookService {
	@Autowired
	IBookRepository bookRepository;
	
	public ResponseEntity getBooks() {
		return new ResponseEntity(bookRepository.findAll(), HttpStatus.OK);
	}
	
}
