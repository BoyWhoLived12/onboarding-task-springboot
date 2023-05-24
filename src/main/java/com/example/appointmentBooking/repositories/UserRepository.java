package com.example.appointmentBooking.repositories;


import com.example.appointmentBooking.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
//    User updateUserByEmail(User user);
}

