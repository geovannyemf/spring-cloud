package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Product;
import com.example.demo.service.IProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {

	@Autowired
	private Environment environment;
	
	@Autowired
	public IProductService productService;
	
	@Operation(summary = "Get all products")
	@ApiResponses(value = { 
			@ApiResponse(responseCode = "200", description = "Found all the books", 
					content = {@Content(mediaType = "application/json", schema = @Schema(implementation = Product.class ))
					}),
			@ApiResponse(responseCode = "400", description = "Not valid request", content = @Content),
			@ApiResponse(responseCode = "404", description = "Products not found", content = @Content)
			
	})
	@GetMapping("/allproducts")
	public List<Product> getMethodName() {
		return productService.findAll().stream().map(p -> {
			p.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
			return p;
		}).toList();
	}
	
	@GetMapping("/productById/{id}")
	public Product getMethodName(@RequestParam Long id) {
		Product product = productService.findById(id);
		product.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return product;
	}
}
