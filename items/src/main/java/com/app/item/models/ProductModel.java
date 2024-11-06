package com.app.item.models;

import java.time.LocalDate;
public class ProductModel {
	private Long id;
	private String name;
	private Double price;
	private LocalDate date;
	private Integer port;
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getPrice() {
		return price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}	
}
