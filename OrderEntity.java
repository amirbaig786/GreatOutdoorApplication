package com.cg.go.entity;
import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="ORDER_TABLE")
public class OrderEntity {
@Id
@GeneratedValue

@Column(name="orderId")
private int orderId;
@Column(name="OrderDate")
private LocalDate OrderDate;
 @OneToOne(cascade = CascadeType.ALL)
 @JoinColumn(name="cart_order")
 private CartItemEntity cart;
 
    
    public OrderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public OrderEntity(int orderId, LocalDate orderDate, CartItemEntity cart) {
		super();
		this.orderId = orderId;
		OrderDate = orderDate;
		this.cart = cart;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public LocalDate getOrderDate() {
		return OrderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		OrderDate = orderDate;
	}

	public CartItemEntity getCart() {
		return cart;
	}

	public void setCart(CartItemEntity cart) {
		this.cart = cart;
	}

	@Override
	public String toString() {
		return "OrderEntity [orderId=" + orderId + ", OrderDate=" + OrderDate + ", cart=" + cart + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((OrderDate == null) ? 0 : OrderDate.hashCode());
		result = prime * result + ((cart == null) ? 0 : cart.hashCode());
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderEntity other = (OrderEntity) obj;
		if (OrderDate == null) {
			if (other.OrderDate != null)
				return false;
		} else if (!OrderDate.equals(other.OrderDate))
			return false;
		if (cart == null) {
			if (other.cart != null)
				return false;
		} else if (!cart.equals(other.cart))
			return false;
		if (orderId != other.orderId)
			return false;
		return true;
	}
	
	
	
    
    
    
}
