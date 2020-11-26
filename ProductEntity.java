package com.cg.go.entity;
import javax.persistence.*;


@Table(name="PRODUCTS")
@Entity
public class ProductEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="productId")
	private Integer productId;
	@Column(name="productName")
	private String productName;
	@Column(name="price")
	private Double price;
	@Column(name="image")
	private String image;
	@Column(name="category")
	private String category;
	@Column(name="quantity")
	private Integer quantity;
	@Column(name="manufacturer")
	private String manufacturer;
	@Column(name="specification")
	private String specification;
	
	
	public ProductEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductEntity( String productName, Double price, String image,
			String category, Integer quantity, String manufacturer, String specification) {
		super();
		
		this.productName = productName;
		this.price = price;
		this.image = image;
		this.category = category;
		this.quantity = quantity;
		this.manufacturer = manufacturer;
		this.specification = specification;
	}




	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public String getCategory() {
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public String getManufacturer() {
		return manufacturer;
	}


	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}


	public String getSpecification() {
		return specification;
	}


	public void setSpecification(String specification) {
		this.specification = specification;
	}
	
	


	@Override
	public String toString() {
		return "ProductEntity [productId=" + productId + ", productName=" + productName + ", price=" + price
				+ ", image=" + image + ", category=" + category + ", quantity=" + quantity
				+ ", manufacturer=" + manufacturer + ", specification=" + specification + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((image == null) ? 0 : image.hashCode());
		result = prime * result + ((manufacturer == null) ? 0 : manufacturer.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((productId == null) ? 0 : productId.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((specification == null) ? 0 : specification.hashCode());
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
		ProductEntity other = (ProductEntity) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (image == null) {
			if (other.image != null)
				return false;
		} else if (!image.equals(other.image))
			return false;
		if (manufacturer == null) {
			if (other.manufacturer != null)
				return false;
		} else if (!manufacturer.equals(other.manufacturer))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (specification == null) {
			if (other.specification != null)
				return false;
		} else if (!specification.equals(other.specification))
			return false;
		return true;
	}
	
	
	
	
}
