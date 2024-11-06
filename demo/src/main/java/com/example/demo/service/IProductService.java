package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Product;

public interface IProductService {

	List<Product> findAll();
	Product findById(Long id);
}
