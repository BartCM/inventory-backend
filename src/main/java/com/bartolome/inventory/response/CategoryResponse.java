package com.bartolome.inventory.response;

import java.util.List;

import com.bartolome.inventory.model.Category;

import lombok.Data;

@Data
public class CategoryResponse {

	private List<Category> category;
}
