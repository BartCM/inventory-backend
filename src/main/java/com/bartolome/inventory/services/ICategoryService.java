package com.bartolome.inventory.services;

import org.springframework.http.ResponseEntity;

import com.bartolome.inventory.model.Category;
import com.bartolome.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
	public ResponseEntity<CategoryResponseRest> searchById(Long id);
	public ResponseEntity<CategoryResponseRest> save(Category category);
}
