package com.laserants.Book_Inventory_api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.laserants.Book_Inventory_api.repositories.IGenreRepository;

@Service
public class GenreService {
	@Autowired
	IGenreRepository genreRepository;
	
	
	public ResponseEntity getGenres() {
		return new ResponseEntity(genreRepository.findAll(), HttpStatus.OK);
	}
}
