package br.com.slauriano.dto;

import java.util.Date;
import java.util.List;

public class OrderDTO {

	private Long customerId;

	private String deliveryAddress;

	private String contact;

	private Long storeId;

	private double total;

	private String status;

	private List<OrderItemDTO> orderItems;

	private String lasteUpdate;

	private String date;

	public OrderDTO() {
	}

	public OrderDTO(Long customerId, String deliveryAddress, String contact, Long storeId, double total, String status,
			String date, String lastUpdate) {
		this.customerId = customerId;
		this.deliveryAddress = deliveryAddress;
		this.contact = contact;
		this.storeId = storeId;
		this.total = total;
		this.status = status;
		this.date = date;
		this.lasteUpdate = lastUpdate;
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

	public List<OrderItemDTO> getOrderItems() {
		return orderItems;
	}

	public void setOrdemItems(List<OrderItemDTO> orderItems) {
		this.orderItems = orderItems;
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

	public String getLasteUpdate() {
		return lasteUpdate;
	}

	public void setLasteUpdate(String lasteUpdate) {
		this.lasteUpdate = lasteUpdate;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
