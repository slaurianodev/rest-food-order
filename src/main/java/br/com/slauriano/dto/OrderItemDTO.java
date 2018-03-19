package br.com.slauriano.dto;

import java.util.Date;

public class OrderItemDTO {

	private Long orderId;
	
	private Long productId;
	
	private double price;
	
	private int quantity;
	
	private double total;
	

	
	public OrderItemDTO() {}
	
	public OrderItemDTO(Long orderId, Long productId, double price, int quantity, double total) {
		this.orderId = orderId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.total = total;

	}
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}

	
}
