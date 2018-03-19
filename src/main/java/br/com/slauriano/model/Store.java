package br.com.slauriano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Store implements GenericModel{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
    
    @Column(name="name")
	private String name;
    
    @Column(name="address")
	private String address;
    
    @Column(name="cousine_id")
	private Long cousineId;
	
	public Store() {}
	
	public Store(String name, String address, Long cousineId) {
		this.name = name;
		this.address = address;
		this.cousineId = cousineId;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getCousine() {
		return cousineId;
	}
	public void setCousine(Long cousineId) {
		this.cousineId = cousineId;
	}
	
	
	
}
