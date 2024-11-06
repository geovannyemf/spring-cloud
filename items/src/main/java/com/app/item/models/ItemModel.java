package com.app.item.models;

import java.util.Random;

public class ItemModel {
	private ProductModel product;
	private Integer quantity;
	
	public ItemModel(ProductModel product) {
		super();
		this.product = product;
		quantity = new Random().nextInt();
	}
	public ProductModel getProduct() {
		return product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setProduct(ProductModel product) {
		this.product = product;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Double getTotal() {
		return product.getPrice()*quantity.doubleValue();
	}
}
