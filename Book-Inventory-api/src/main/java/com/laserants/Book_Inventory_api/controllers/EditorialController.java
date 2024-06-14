package com.laserants.Book_Inventory_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laserants.Book_Inventory_api.services.EditorialService;

@RestController
@RequestMapping("/editorials")
public class EditorialController {
	@Autowired
	private EditorialService editorialService;

	@GetMapping
	public ResponseEntity getEditorials() {
		return editorialService.getEditorials();
	}
}
