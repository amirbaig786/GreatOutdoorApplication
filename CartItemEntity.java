package com.cg.go.entity;

import java.util.Map;
import javax.persistence.*;

@Entity
@Table(name="carttable")
public class CartItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cartId")
    private long cartId;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;
    @ElementCollection
    @CollectionTable(name="Product_qty")
    private Map<ProductEntity, Integer> products ;// product ,quantity
    
    @Column(name="cartTotalPrice")
    private double cartTotalPrice;
    @Column(name="totalQuantity")
    private long totalQuantity;
    
    public CartItemEntity(Customer user, Map<ProductEntity, Integer> products, double cartTotalPrice,
            long totalQuantity) {
        super();
        
        this.customer = user;
        this.products = products;
        this.cartTotalPrice = cartTotalPrice;
        this.totalQuantity = totalQuantity;
    }
    
    
    public CartItemEntity() {
		// TODO Auto-generated constructor stub
	}


	public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer user) {
        this.customer = user;
    }
    public Map<ProductEntity, Integer> getProducts() {
        return products;
    }
    public void setProducts(Map<ProductEntity, Integer> products) {
        this.products = products;
    }
    public double getCartTotalPrice() {
        return cartTotalPrice;
    }
    public void setCartTotalPrice(double cartTotalPrice) {
        this.cartTotalPrice = cartTotalPrice;
    }
    public long getTotalQuantity() {
        return totalQuantity;
    }
    public void setTotalQuantity(long totalQuantity) {
        this.totalQuantity = totalQuantity;
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(cartTotalPrice);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        result = prime * result + ((products == null) ? 0 : products.hashCode());
        result = prime * result + (int) (totalQuantity ^ (totalQuantity >>> 32));
        result = prime * result + ((customer == null) ? 0 : customer.hashCode());
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
        CartItemEntity other = (CartItemEntity) obj;
        if (Double.doubleToLongBits(cartTotalPrice) != Double.doubleToLongBits(other.cartTotalPrice))
            return false;
        if (products == null) {
            if (other.products != null)
                return false;
        } else if (!products.equals(other.products))
            return false;
        if (totalQuantity != other.totalQuantity)
            return false;
        if (customer == null) {
            if (other.customer != null)
                return false;
        } else if (!customer.equals(other.customer))
            return false;
        return true;
    }
    
}