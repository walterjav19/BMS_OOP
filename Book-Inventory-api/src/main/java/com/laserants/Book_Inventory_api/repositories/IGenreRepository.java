package com.laserants.Book_Inventory_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laserants.Book_Inventory_api.models.GenreModel;

@Repository
public interface IGenreRepository extends JpaRepository<GenreModel, Integer>{

}
