package com.app.item.services;

import java.util.List;

import com.app.item.models.ItemModel;

public interface ItemService {

	List<ItemModel> findAll();
	ItemModel findById(Long id);
}
