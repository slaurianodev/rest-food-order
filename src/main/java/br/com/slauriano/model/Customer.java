package br.com.slauriano.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements GenericModel{

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
    
    @Column(name="email")
	private String email;
    
    @Column(name="name")
	private String name;
    
    @Column(name="address")
	private String address;
    
    @Column(name="creation")
	private Date creation;
    
    @Column(name="password")
	private String password;
    
    protected Customer() {}
    
    public Customer(String email, String name, String address, Date creation, String password) {
    		this.email = email;
    		this.name = name;
    		this.address = address;
    		this.creation = creation;
    		this.password = password;
    }
    
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public String getCreation() {
		return formatDate(creation);
	}
	public void setCreation(Date creation) {
		this.creation = creation;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
    public String toString() {
        return String.format(
                "Customer[id=%s, email=%s, name=%s,address=%s, creation=%s, password=%s]",
                id,email,name,address,creation,password);
    }
	
}
