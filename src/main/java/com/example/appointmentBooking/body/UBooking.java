package com.example.appointmentBooking.body;

import javax.persistence.Column;
import java.sql.Date;
import java.sql.Time;

public class UBooking {
    private String email;
    private String name;
    private String address;
    private String phoneNo;
    private String appDate;
    private Long appNo;
    private String time;
    private String vehicleNo;

    public UBooking() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getAppNo() {
        return appNo;
    }

    public void setAppNo(Long appNo) {
        this.appNo = appNo;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }


    public String getAppDate() {
        return appDate;
    }

    public void setAppDate(String appDate) {
        this.appDate = appDate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public UBooking(String email, String name, String address, String phoneNo, String appDate, String time, String vehicleNo) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.appDate = appDate;
        this.time = time;
        this.vehicleNo = vehicleNo;
    }

    public UBooking(String email, String name, String address, String phoneNo, String appDate, Long appNo, String time, String vehicleNo) {

        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.appDate = appDate;
        this.appNo = appNo;
        this.time = time;
        this.vehicleNo = vehicleNo;
    }
}
