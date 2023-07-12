package com.bartolome.inventory.dao;

import org.springframework.data.repository.CrudRepository;

import com.bartolome.inventory.model.Category;

public interface ICategoryDao extends CrudRepository<Category, Long>{

}
