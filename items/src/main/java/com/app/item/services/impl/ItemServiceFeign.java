package com.app.item.services.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.item.clients.ProductRest;
import com.app.item.models.ItemModel;
import com.app.item.services.ItemService;

@Service("itemServiceFeign")
public class ItemServiceFeign implements ItemService {

	@Autowired
	private ProductRest productClientRest;
	
	@Override
	public List<ItemModel> findAll() {
		return productClientRest.getAllItems().stream().map(p->new ItemModel(p)).toList();
	}

	@Override
	public ItemModel findById(Long id) {
		return new ItemModel(productClientRest.findItemById(id));
	}

}
