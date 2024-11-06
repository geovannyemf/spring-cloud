package com.app.item.services.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.app.item.models.ItemModel;
import com.app.item.models.ProductModel;
import com.app.item.services.ItemService;

@Service("itemService")
public class ItemServiceImpl implements ItemService{

	@Autowired
	private RestTemplate clientRest;
	
	@Override
	public List<ItemModel> findAll() {
		return Arrays.asList(
				clientRest.getForObject("http://localhost:8081/allproducts", 
						ProductModel[].class)).stream().
				map(p-> new ItemModel(p)).collect(Collectors.toList());
	}

	@Override
	public ItemModel findById(Long id) {
		return new ItemModel(clientRest.getForObject("http://localhost:8081/productById/{id}",
				ProductModel.class, Map.of("id",id)));
	}

}
