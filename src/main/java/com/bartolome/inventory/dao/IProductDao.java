package com.bartolome.inventory.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bartolome.inventory.model.Product;

public interface IProductDao extends CrudRepository<Product, Long>{
	
	@Query("Select p from Product p where p.name like %?1%")
	List<Product> findByNameLike(String name);
	
	List<Product> findByNameContainingIgnoreCase(String name);

}
