package com.rentalappapi.api.entity;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "saurabh_appointments")
public class saurabhAppointment {


    @Override
    public String toString() {
        return "saurabhAppointment [appointmentId=" + appointmentId + ", userId=" + userId + ", ownerId=" + ownerId
                + ", appointmentDate=" + appointmentDate + ", appointmentTime=" + appointmentTime
                + ", appointmentStatus=" + appointmentStatus + ", reasonForVisit=" + reasonForVisit + ", createdAt="
                + createdAt + "]";
    }

    public saurabhAppointment() {
    }

    public saurabhAppointment(int appointmentId, int userId, int ownerId, LocalDate appointmentDate,
            LocalTime appointmentTime, String appointmentStatus, String reasonForVisit, LocalDateTime createdAt) {
        this.appointmentId = appointmentId;
        this.userId = userId;
        this.ownerId = ownerId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
        this.appointmentStatus = appointmentStatus;
        this.reasonForVisit = reasonForVisit;
        this.createdAt = createdAt;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appointment_id")
    private int appointmentId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "owner_id")
    private int ownerId;

    @Column(name = "appointment_date")
    private LocalDate appointmentDate;

    @Column(name = "appointment_time")
    private LocalTime appointmentTime;

    @Column(name = "appointment_status", length = 100)
    private String appointmentStatus;

    @Column(name = "reason_for_visit", length = 255)
    private String reasonForVisit;

    @Column(name = "created_at", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    // Getters and Setters

    public int getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        this.appointmentId = appointmentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public LocalDate getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(LocalDate appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public LocalTime getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(LocalTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentStatus() {
        return appointmentStatus;
    }

    public void setAppointmentStatus(String appointmentStatus) {
        this.appointmentStatus = appointmentStatus;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
    




