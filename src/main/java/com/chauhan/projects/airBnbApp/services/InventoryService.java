package com.chauhan.projects.airBnbApp.services;

import com.chauhan.projects.airBnbApp.dto.HotelDto;
import com.chauhan.projects.airBnbApp.dto.HotelSearchRequest;
import com.chauhan.projects.airBnbApp.entities.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteAllInventories(Room room);

    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}

