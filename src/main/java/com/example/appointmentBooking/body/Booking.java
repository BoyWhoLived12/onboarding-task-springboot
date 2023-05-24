package com.example.appointmentBooking.body;

import javax.persistence.Column;
import java.sql.Date;
import java.sql.Time;

public class Booking {
    private String email;
    private String name;
    private String address;
    private String phoneNo;
    private String appDate;

    private String time;
    private String vehicleNo;

    public Booking() {
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

    public Booking(String email, String name, String address, String phoneNo, String appDate, String time, String vehicleNo) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.appDate = appDate;
        this.time = time;
        this.vehicleNo = vehicleNo;
    }
}
