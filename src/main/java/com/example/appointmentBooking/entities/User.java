package com.example.appointmentBooking.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
    @Id
    private String email;
    @Column(name="name")
    private String name;
    @Column(name="address")
    private String address;
    @Column(name="phone_no")
    private String phoneNo;

    public User() {
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public User(String email, String name, String address, String phoneNo) {
        this.email = email;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }
}
