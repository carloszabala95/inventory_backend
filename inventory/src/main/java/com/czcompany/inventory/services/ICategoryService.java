package com.czcompany.inventory.services;

import org.springframework.http.ResponseEntity;

import com.czcompany.inventory.response.CategoryResponse;
import com.czcompany.inventory.response.CategoryResponseRest;

public interface ICategoryService {
	
	public ResponseEntity<CategoryResponseRest> search();
	
}
