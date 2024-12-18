package com.rentalappapi.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentalappapi.api.entity.saurabhAppointment;
import com.rentalappapi.api.model.AppointmentRequestBody;
import com.rentalappapi.api.repositories.AppointmentRepository;

@Service
public class AppointmentService {
    @Autowired
    AppointmentRepository arepo;
    //get methods ------------------------------------------------------------------------------------->
    public List<saurabhAppointment> ListAllAppointments () {
        return arepo.findAll();
    } 

    public saurabhAppointment GetAppointmentById(int id) {
        return arepo.findById(id).orElse(new saurabhAppointment());
    }

    //post methods ------------------------------------------------------------------------------------>
    public String CreateAppointment(AppointmentRequestBody appointment) {
        saurabhAppointment appo = new saurabhAppointment();
        appo.setAppointmentId(appointment.getAppointmentId());
        appo.setUserId(appointment.getUserId());
        appo.setOwnerId(appointment.getOwnerId());
        appo.setAppointmentDate(appointment.getAppointmentDate());
        appo.setAppointmentTime(appointment.getAppointmentTime());
        appo.setAppointmentStatus(appointment.getAppointmentStatus());
        appo.setReasonForVisit(appointment.getReasonForVisit());
        appo.setCreatedAt(appointment.getCreatedAt());
        arepo.save(appo);
        return "Appointment Created";
    }
    //put methods -------------------------------------------------------------------------------------->
    public String UpdateAppointment(AppointmentRequestBody appointment) {
        saurabhAppointment appo = new saurabhAppointment();
        appo.setAppointmentId(appointment.getAppointmentId());
        appo.setUserId(appointment.getUserId());
        appo.setOwnerId(appointment.getOwnerId());
        appo.setAppointmentDate(appointment.getAppointmentDate());
        appo.setAppointmentTime(appointment.getAppointmentTime());
        appo.setAppointmentStatus(appointment.getAppointmentStatus());
        appo.setReasonForVisit(appointment.getReasonForVisit());
        appo.setCreatedAt(appointment.getCreatedAt());
        arepo.save(appo);
        return "Appointment Updated";
    }
    //Delete methods ----------------------------------------------------------------------------------->
    public String DeleteAppointment(int id){
        arepo.deleteById(id);
        return "appointment Deleted";
    }
}
