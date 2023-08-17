package com.bartolome.inventory.response;

import java.util.List;

import com.bartolome.inventory.model.Product;

import lombok.Data;

@Data
public class ProductResponse {
	
	List<Product> products;

}
