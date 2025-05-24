package com.chauhan.projects.airBnbApp.services;

import com.chauhan.projects.airBnbApp.dto.BookingDto;
import com.chauhan.projects.airBnbApp.dto.BookingRequest;
import com.chauhan.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}

