package com.app.item.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.app.item.models.ItemModel;
import com.app.item.services.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ItemController {
	
	Logger logger = LoggerFactory.getLogger(ItemController.class);
	@Autowired
	@Qualifier("itemServiceFeign")
	private ItemService itemService;
	
	@Value("${configuration.message}")
	private String message;
	
	
	@GetMapping("/allitems")
	public List<ItemModel> getAllItems() {
		return itemService.findAll();
	}
	
	@GetMapping("/findItemById/{id}")
	public ItemModel getMethodName(@PathVariable Long id) {
		return itemService.findById(id);
	}
	
	@GetMapping("/fetch-config")
	public ResponseEntity<?> getMethodName(@Value("${server.port}") String port ) {
		Map<String, String> json = new HashMap<>();
		json.put("message", message);
		json.put("port", port);
		logger.info("message -> "+message);
		logger.info("port -> "+port);
		return ResponseEntity.ok(json);
	}
	
	
}