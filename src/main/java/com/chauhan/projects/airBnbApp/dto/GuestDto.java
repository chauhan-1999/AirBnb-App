package com.chauhan.projects.airBnbApp.dto;

import com.chauhan.projects.airBnbApp.entities.User;
import com.chauhan.projects.airBnbApp.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
