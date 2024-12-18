package com.rentalappapi.api.model;

public class PropertyRequestBody {
 
 

	 
	private int propertyId;

 
	private String ownerId;
 
	private String title;
 
	private String description;
 
	private String address;
 
	private String city;
 
	private String state;
	
 	private String rent_per_month;
	
 	private String created_at;
 	
	 
	public int getPropertyId() {
		return propertyId;
	}

	public void setPropertyId(int propertyId) {
		this.propertyId = propertyId;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getRent_per_month() {
		return rent_per_month;
	}

	public void setRent_per_month(String rent_per_month) {
		this.rent_per_month = rent_per_month;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

 
	
}
