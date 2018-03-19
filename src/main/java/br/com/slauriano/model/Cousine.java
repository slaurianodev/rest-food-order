package br.com.slauriano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cousine implements GenericModel{
    
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	public Long getId() {
		return id;
	}
	
	public Cousine() {}
	
	public Cousine(String name) {
		this.name = name;
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
	
	
	
}
