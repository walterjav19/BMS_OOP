package com.laserants.Book_Inventory_api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.laserants.Book_Inventory_api.models.EditorialModel;

@Repository
public interface IEditorialRepository extends JpaRepository<EditorialModel, Long>{

}
