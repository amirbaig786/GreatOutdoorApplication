package com.cg.go.entity;

import javax.persistence.*;

@Table(name="SalesReport")
@Entity
public class SalesReportEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="salesReportId")
	private long salesReportId;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="product_sales")
	
	private ProductEntity product;
	@Column(name="quantitySold")
	private Integer quantitySold;
	@Column(name="totalSale")
	private double totalSale;
	
	
	public SalesReportEntity() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SalesReportEntity(long salesReportId, ProductEntity product, Integer quantitySold, double totalSale) {
		super();
		this.salesReportId = salesReportId;
		this.product = product;
		this.quantitySold = quantitySold;
		this.totalSale = totalSale;
	}


	public long getSalesReportId() {
		return salesReportId;
	}


	public void setSalesReportId(long salesReportId) {
		this.salesReportId = salesReportId;
	}


	public ProductEntity getProduct() {
		return product;
	}


	public void setProduct(ProductEntity product) {
		this.product = product;
	}


	public Integer getQuantitySold() {
		return quantitySold;
	}


	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}


	public double getTotalSale() {
		return totalSale;
	}


	public void setTotalSale(double totalSale) {
		this.totalSale = totalSale;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((product == null) ? 0 : product.hashCode());
		result = prime * result + ((quantitySold == null) ? 0 : quantitySold.hashCode());
		result = prime * result + (int) (salesReportId ^ (salesReportId >>> 32));
		long temp;
		temp = Double.doubleToLongBits(totalSale);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		SalesReportEntity other = (SalesReportEntity) obj;
		if (product == null) {
			if (other.product != null)
				return false;
		} else if (!product.equals(other.product))
			return false;
		if (quantitySold == null) {
			if (other.quantitySold != null)
				return false;
		} else if (!quantitySold.equals(other.quantitySold))
			return false;
		if (salesReportId != other.salesReportId)
			return false;
		if (Double.doubleToLongBits(totalSale) != Double.doubleToLongBits(other.totalSale))
			return false;
		return true;
	}
	
	
	
	
	
}
