package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	public ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(Long id) {
		return productRepository.findById(id).orElse(null);
	}

}
