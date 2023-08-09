package com.example.ats.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String username;

    @JsonIgnore
    String password; // Ensures password isn't exposed in any serialization

    private String role; // e.g., "Admin", "User", "Recruiter"

    private LocalDate lastLogin;

}
