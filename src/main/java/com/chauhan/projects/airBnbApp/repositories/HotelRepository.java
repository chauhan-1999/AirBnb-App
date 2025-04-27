package com.chauhan.projects.airBnbApp.repositories;

import com.chauhan.projects.airBnbApp.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel,Long> {
}
