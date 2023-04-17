package com.czcompany.inventory.response;

import java.util.List;

import com.czcompany.inventory.model.Category;

import lombok.Data;

@Data

public class CategoryResponse {
	
	private List<Category> category;

}
