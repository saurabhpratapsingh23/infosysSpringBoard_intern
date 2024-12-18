package com.rentalappapi.api.repositories;

import org.springframework.data.domain.Page;
 import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rentalappapi.api.entity.PropertyEntity;
 
@Repository
public interface  PropertyRepository extends CrudRepository<PropertyEntity,Integer> {

	@Query(value = "select * from  saurabh_property", nativeQuery = true)
	Page<PropertyEntity> listallusersfromdb(Pageable pageable);

	@Query(value = "SELECT count(*) from saurabh_property", nativeQuery = true)
	String countNumberOfProperty();



}
