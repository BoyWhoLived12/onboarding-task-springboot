package com.example.appointmentBooking.entities;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
@Entity
@Table(name="APPOINTMENT")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="appNo")
    private Long appNo;
    @Column(name="email")
    private String email;
    @Column(name="appDate")
    private String appDate;

    private String appTime;
    private String vehicleNo;

    public Appointment(Long appNo, String email, String appDate, String appTime, String vehicleNo) {
        this.appNo = appNo;
        this.email = email;
        this.appDate = appDate;
        this.appTime = appTime;
        this.vehicleNo = vehicleNo;
    }

    public Appointment() {
    }

    public void setAppNo(Long appNo) {
        this.appNo = appNo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public void setAppTime(String appTime) {
        this.appTime = appTime;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Long getAppNo() {
        return appNo;
    }

    public String getEmail() {
        return email;
    }

    public String getAppDate() {
        return appDate;
    }

    public String getAppTime() {
        return appTime;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public Appointment(String email, String appDate, String appTime, String vehicleNo) {
        this.email = email;
        this.appDate = appDate;
        this.appTime = appTime;
        this.vehicleNo = vehicleNo;
    }
}
