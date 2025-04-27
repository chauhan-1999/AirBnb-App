package com.chauhan.projects.airBnbApp.entities;

import com.chauhan.projects.airBnbApp.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "app_user") //In,PostgreSql we cannot create a table with user name
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;

    @ElementCollection(fetch = FetchType.EAGER)//a collection of basic (roles)
    // that should be stored in a separate table.
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;
}
