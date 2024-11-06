package com.app.item.clients;

import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.app.item.models.ProductModel;

@FeignClient(name = "service-products")
public interface ProductRest {
	@GetMapping("/allproducts")
	List<ProductModel> getAllItems();
	
	@GetMapping("/productById/{id}")
	ProductModel findItemById(@PathVariable Long id);
}