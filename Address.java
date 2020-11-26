package com.cg.go.entity;

import javax.persistence.Entity;

import javax.persistence.*;


@Table(name="Addresstable")
@Entity
public class Address {
	
	@Id
	@Column(name="addressId", length=100)
	private String addressId;
	
	@Column(name="buildingNo")
	private int buildingNo;
	@Column(name="streetname",length=100)
	private String streetName;
	@Column(name="area",length=100)
	private String area;
	@Column(name="city",length=100)
	private String city;
	@Column(name="state",length=100)
	private String state;
	@Column(name="zip")
	private int zip;
	

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addressId, int buildingNo, String streetName, String area, String city, String state,
			int zip) {
		super();
		this.addressId = addressId;
		this.buildingNo = buildingNo;
		this.streetName = streetName;
		this.area = area;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public int getBuildingNo() {
		return buildingNo;
	}
	public void setBuildingNo(int buildingNo) {
		this.buildingNo = buildingNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZip() {
		return zip;
	}
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", buildingNo=" + buildingNo + ", streetName=" + streetName
				+ ", area=" + area + ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressId == null) ? 0 : addressId.hashCode());
		result = prime * result + ((area == null) ? 0 : area.hashCode());
		result = prime * result + buildingNo;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetName == null) ? 0 : streetName.hashCode());
		result = prime * result + zip;
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
		Address other = (Address) obj;
		if (addressId == null) {
			if (other.addressId != null)
				return false;
		} else if (!addressId.equals(other.addressId))
			return false;
		if (area == null) {
			if (other.area != null)
				return false;
		} else if (!area.equals(other.area))
			return false;
		if (buildingNo != other.buildingNo)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (streetName == null) {
			if (other.streetName != null)
				return false;
		} else if (!streetName.equals(other.streetName))
			return false;
		if (zip != other.zip)
			return false;
		return true;
	}
	
	
}
