package com.chauhan.projects.airBnbApp.repositories;

import com.chauhan.projects.airBnbApp.entities.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}
