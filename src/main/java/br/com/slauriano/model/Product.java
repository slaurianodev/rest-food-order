package br.com.slauriano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
    
    @Column(name="store_id")
	private Long storeId;
    
    @Column(name="name")
	private String name;
    
    @Column(name="description")
	private String description;
    
    @Column(name="price")
	private Double price;
	
	public Product() {}
	
	public Product(Long storeId,String name,String description,Double price) {
		this.storeId = storeId;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	
	
}
