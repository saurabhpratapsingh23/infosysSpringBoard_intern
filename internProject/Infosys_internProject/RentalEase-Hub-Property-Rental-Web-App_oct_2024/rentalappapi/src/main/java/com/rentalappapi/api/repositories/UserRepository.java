package com.rentalappapi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalappapi.api.entity.saurabhUser;


@Repository
public interface UserRepository extends JpaRepository<saurabhUser, Integer> {
}
