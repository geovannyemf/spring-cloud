package com.example.demo.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double price;
	@Column(name = "createat", nullable = false)
	private LocalDate createAt;
	@Transient
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
	public LocalDate getCreateAt() {
		return createAt;
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
	public void setCreateAt(LocalDate createAt) {
		this.createAt = createAt;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	} 
	
}
