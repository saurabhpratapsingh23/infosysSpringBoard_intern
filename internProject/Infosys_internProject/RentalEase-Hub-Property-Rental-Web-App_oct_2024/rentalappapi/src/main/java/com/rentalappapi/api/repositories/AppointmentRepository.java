package com.rentalappapi.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentalappapi.api.entity.saurabhAppointment;
@Repository
public interface AppointmentRepository extends JpaRepository<saurabhAppointment, Integer> {
    
}