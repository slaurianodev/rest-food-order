package br.com.slauriano.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="id")
	private Long id;
    
    @Column(name="order_id")
	private Long orderId;
    
//    @ManyToOne
//    @JoinColumn(name="order_id")
//    private OrderCustomer orderCustomer;
    
    @Column(name="product_id")
	private Long productId;
    
    @Column(name="price")
	private double price;
    
    @Column(name="quantity")
	private int quantity;
    
    @Column(name="total")
	private double total;

	public OrderItem() {
	}

	public OrderItem(Long orderId, Long productId, double price, int quantity, double total) {
		this.orderId = orderId;
		this.productId = productId;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

//	public OrderCustomer getOrderCustomer() {
//		return orderCustomer;
//	}
//
//	public void setOrderCustomer(OrderCustomer orderCustomer) {
//		this.orderCustomer = orderCustomer;
//	}

	
	
}
