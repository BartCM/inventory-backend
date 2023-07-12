package com.bartolome.inventory.services;

import org.springframework.http.ResponseEntity;

import com.bartolome.inventory.response.CategoryResponseRest;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseRest> search();
}
