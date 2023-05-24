package com.example.appointmentBooking.controller;


import com.example.appointmentBooking.body.Booking;
import com.example.appointmentBooking.body.Email;
import com.example.appointmentBooking.body.UBooking;
import com.example.appointmentBooking.entities.Appointment;
import com.example.appointmentBooking.entities.User;
import com.example.appointmentBooking.repositories.AppointmentRepository;
import com.example.appointmentBooking.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

import org.springframework.web.bind.annotation.PostMapping;

@RestController()
public class BookingContorller {
    private final UserRepository userRepository;
    private final AppointmentRepository appointmentRepository;

    @Autowired
    public BookingContorller(UserRepository userRepository, AppointmentRepository appointmentRepository){
        this.appointmentRepository = appointmentRepository;
        this.userRepository = userRepository;
    }
    @GetMapping("/users")
    public List<User> getAllUser(){
        User u = new User();
        u.setEmail("b@gmail.com");
        u.setAddress("A-fjahdjfka");
        u.setPhoneNo("568724798");
        u.setName("Bansal");
//        userRepository.save(u);
        List<User>  l = userRepository.findAll();
        System.out.println(l.size());
        return l;
    }
    @PostMapping("/newbooking")
    public Appointment addBooking(@RequestBody Booking b){
        User a= userRepository.save(new User(b.getEmail(), b.getName(), b.getAddress(), b.getPhoneNo()));
        Appointment c = appointmentRepository.save(new Appointment(b.getEmail(), b.getAppDate(), b.getTime(), b.getVehicleNo()));
        return c;
    }
    @GetMapping("/allbooking")
    public List<Appointment> getAllApp(){
        return appointmentRepository.findAll();
    }
    @PostMapping("/emailbooking")
    public List<Appointment> getByEmail(@RequestBody Email email){
        System.out.println(email.getEmail());
        return appointmentRepository.findAllByEmail(email.getEmail());
    }
    @PostMapping("/deleteBooking")
    public boolean deleteBooking(@RequestBody Appointment app){
        appointmentRepository.deleteById(app.getAppNo());
        return true;
    }

    @PostMapping("/updateUser")
    public boolean updateUser(@RequestBody User user){
        User u = userRepository.findById(user.getEmail()).get();
        if(u.getEmail() == null) return false;
        userRepository.deleteById(user.getEmail());
        u.setName(user.getName());
        u.setAddress(user.getAddress());
        u.setPhoneNo(user.getPhoneNo());
        userRepository.save(u);
        return true;
    }
    @PostMapping("/updateApp")
    public boolean updateAppointment(@RequestBody Appointment app){
        Appointment a = appointmentRepository.findById(app.getAppNo()).get();
        if(a.getAppNo()==null&& !Objects.equals(a.getEmail(), app.getEmail()))    return false;
        appointmentRepository.deleteById(app.getAppNo());
        a.setAppDate(app.getAppDate());
        a.setAppTime(app.getAppTime());
        a.setVehicleNo(app.getVehicleNo());
        appointmentRepository.save(a);
        return true;
    }

}
