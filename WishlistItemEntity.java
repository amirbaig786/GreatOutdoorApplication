package com.cg.go.entity;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="wishlist")

public class WishlistItemEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="wishlistId")
	private long wishlistId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customer_wishlist")
	private Customer customer;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="prod_wish")
	private List<ProductEntity> products;
	
	public WishlistItemEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public WishlistItemEntity(long wishlistId, Customer customer, List<ProductEntity> products) {
		super();
		this.wishlistId = wishlistId;
		this.customer = customer;
		this.products = products;
	}

	public long getWishlistId() {
		return wishlistId;
	}

	public void setWishlistId(long wishlistId) {
		this.wishlistId = wishlistId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<ProductEntity> getProducts() {
		return products;
	}

	public void setProducts(List<ProductEntity> products) {
		this.products = products;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customer == null) ? 0 : customer.hashCode());
		result = prime * result + ((products == null) ? 0 : products.hashCode());
		result = prime * result + (int) (wishlistId ^ (wishlistId >>> 32));
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
		WishlistItemEntity other = (WishlistItemEntity) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		if (wishlistId != other.wishlistId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "WishlistItemEntity [wishlistId=" + wishlistId + ", customer=" + customer + ", products=" + products
				+ "]";
	}
	
	

	
	
	
	
	
	
}
