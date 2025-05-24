package com.chauhan.projects.airBnbApp.repositories;

import com.chauhan.projects.airBnbApp.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
