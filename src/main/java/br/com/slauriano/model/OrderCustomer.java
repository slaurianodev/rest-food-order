package br.com.slauriano.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class OrderCustomer implements GenericModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "date")
	private Date date;

	@Column(name = "customer_id")
	private Long customerId;

	@Column(name = "delivery_address")
	private String deliveryAddress;

	@Column(name = "contact")
	private String contact;

	@Column(name = "store_id")
	private Long storeId;

	@Column(name = "total")
	private double total;

	@Column(name = "status")
	private String status;

	@Column(name = "last_update")
	private Date lastUpdate;
	
//	@JoinColumn
//	@OneToMany(mappedBy = "order_id")
//	private List<OrderItem> orderItem;

	public OrderCustomer() {
	}

	public OrderCustomer(Date date, Long customerId, String deliveryAddress, String contact, Long storeId, double total,
			String status, Date lastUpdate) {

		this.date = date;
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.contact = contact;
		this.storeId = storeId;
		this.total = total;
		this.status = status;
		this.lastUpdate = lastUpdate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return formatDate(date);
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLastUpdate() {
		return formatDate(lastUpdate);
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	
//	public List<OrderItem> getOrderItem() {
//		return orderItem;
//	}
//
//	public void setOrderItem(List<OrderItem> orderItem) {
//		this.orderItem = orderItem;
//	}
	
	

}
