package com.rentalappapi.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.rentalappapi.api.entity.PropertyEntity;
import com.rentalappapi.api.model.PropertyIdRequest;
import com.rentalappapi.api.model.PropertyRequestBody;
import com.rentalappapi.api.repositories.PropertyRepository;

@Service
public class PropertyService  {

	@Autowired
	private PropertyRepository PropertyRepository;

	

	public PropertyEntity createProperty(PropertyRequestBody propertyRequestBodyObj) {

		PropertyEntity newProperty = new PropertyEntity();
		newProperty.setTitle(propertyRequestBodyObj.getTitle());
		newProperty.setDescription(propertyRequestBodyObj.getDescription());
		newProperty.setOwnerId(propertyRequestBodyObj.getOwnerId());
		newProperty.setAddress(propertyRequestBodyObj.getAddress());
		newProperty.setCity(propertyRequestBodyObj.getCity());
		newProperty.setState(propertyRequestBodyObj.getState());
		newProperty.setRent_per_month(propertyRequestBodyObj.getRent_per_month());
		return PropertyRepository.save(newProperty);		 
	}

	public PropertyEntity updateProperty(PropertyRequestBody propertyRequestBodyObj) {
		PropertyEntity newProperty = new PropertyEntity();
		newProperty.setPropertyId(propertyRequestBodyObj.getPropertyId() );
		newProperty.setTitle(propertyRequestBodyObj.getTitle());
		newProperty.setDescription(propertyRequestBodyObj.getDescription());
		newProperty.setOwnerId(propertyRequestBodyObj.getOwnerId());
		newProperty.setAddress(propertyRequestBodyObj.getAddress());
		newProperty.setCity(propertyRequestBodyObj.getCity());
		newProperty.setState(propertyRequestBodyObj.getState());
		newProperty.setRent_per_month(propertyRequestBodyObj.getRent_per_month());
		return PropertyRepository.save(newProperty);		 
	}

	public Page<PropertyEntity> listallusersfromdb(int pageNumber, int size) {
		Pageable pageable = PageRequest.of(pageNumber, size);
		return PropertyRepository.listallusersfromdb(pageable);
	}
 
	public String deleteProperty(PropertyIdRequest user) {
		int PropertyId= user.getEmpId();
		PropertyRepository.deleteById(PropertyId);
		return "Property Deleted";
	}

	public String countNumberOfPropertys() {

		return PropertyRepository.countNumberOfProperty();
	}

}
