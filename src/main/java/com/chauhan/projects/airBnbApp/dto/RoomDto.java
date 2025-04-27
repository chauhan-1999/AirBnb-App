package com.chauhan.projects.airBnbApp.dto;

import com.chauhan.projects.airBnbApp.entities.Hotel;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class RoomDto {
    private Long id;
    private String type;
    private BigDecimal basePrice;//1000.96
    private Integer totalCount;
    private Integer capacity;
    private String[] photos;
    private String[] amenities;

}
