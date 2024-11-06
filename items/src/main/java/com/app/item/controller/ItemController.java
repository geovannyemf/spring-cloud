package com.app.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.RestController;

import com.app.item.models.ItemModel;
import com.app.item.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ItemController {
	
	@Autowired
	@Qualifier("itemServiceFeign")
	private ItemService itemService;
	
	@GetMapping("/allitems")
	public List<ItemModel> getAllItems() {
		return itemService.findAll();
	}
	
	@GetMapping("/findItemById/{id}")
	public ItemModel getMethodName(@PathVariable Long id) {
		return itemService.findById(id);
	}
}
