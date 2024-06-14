package com.laserants.Book_Inventory_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.laserants.Book_Inventory_api.repositories.IEditorialRepository;

@Service
public class EditorialService {
	
	@Autowired
	IEditorialRepository editorialRepository;
	
	public ResponseEntity getEditorials() {
		return new ResponseEntity(editorialRepository.findAll(), HttpStatus.OK);
	}

}
