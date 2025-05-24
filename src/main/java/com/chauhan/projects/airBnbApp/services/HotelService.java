package com.chauhan.projects.airBnbApp.services;

import com.chauhan.projects.airBnbApp.dto.HotelDto;
import com.chauhan.projects.airBnbApp.dto.HotelInfoDto;

public interface HotelService { HotelDto createNewHotel(HotelDto hotelDto);

    HotelDto getHotelById(Long id);

    HotelDto updateHotelById(Long id, HotelDto hotelDto);

    void deleteHotelById(Long id);

    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);

}
