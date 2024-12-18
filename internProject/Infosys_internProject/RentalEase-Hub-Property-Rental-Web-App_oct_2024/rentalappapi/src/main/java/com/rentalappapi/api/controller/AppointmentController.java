package com.rentalappapi.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rentalappapi.api.entity.saurabhAppointment;
import com.rentalappapi.api.model.AppointmentRequestBody;
import com.rentalappapi.api.service.AppointmentService;

@RestController
@CrossOrigin
public class AppointmentController {

    @Autowired
    AppointmentService aservice;

    //get methods ------------------------------------------------------------------------------->
    @GetMapping("/ListAllAppointments")
    public List<saurabhAppointment> ListAllAppointments() {
        return aservice.ListAllAppointments();
    }
    @GetMapping("/GetAppointmentById/{id}")
    public saurabhAppointment GetAppointmentById(@PathVariable int id) {
        return aservice.GetAppointmentById(id);
    }
    //post methods ------------------------------------------------------------------------------->
    @PostMapping("/CreateAppointment")
    public String CreateAppointment(@RequestBody AppointmentRequestBody appointment) {
        return aservice.CreateAppointment(appointment);
    }
    //Update methods ------------------------------------------------------------------------------>
    @PutMapping("/UpdateAppointment")
    public String UpdateAppointment(@RequestBody AppointmentRequestBody appointment) {
        return aservice.UpdateAppointment(appointment);
    }
    //Delete methods ------------------------------------------------------------------------------>

    @DeleteMapping("/DeleteAppointment/{id}")
    public String DeleteAppointment(@PathVariable int id) {
        return aservice.DeleteAppointment(id);
    }
}
