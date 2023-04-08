package com.czcompany.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.czcompany.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{
	
	
	
}
