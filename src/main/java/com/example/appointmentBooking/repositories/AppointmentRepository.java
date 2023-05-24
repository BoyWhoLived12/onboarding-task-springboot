package com.example.appointmentBooking.repositories;

import com.example.appointmentBooking.entities.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

    List<Appointment> findAllByEmail(String email);
}
