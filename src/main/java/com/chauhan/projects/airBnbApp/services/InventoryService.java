package com.chauhan.projects.airBnbApp.services;

import com.chauhan.projects.airBnbApp.entities.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

    void deleteFutureInventories(Room room);

}

