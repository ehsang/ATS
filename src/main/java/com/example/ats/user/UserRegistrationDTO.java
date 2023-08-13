package com.example.ats.user;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
public class UserRegistrationDTO {
    private String userName;
    private String password; // This will initially hold the plain-text password.
    private LocalDate lastLogin;
    private String role; // e.g., "Admin", "User", "Recruiter"
    private String email;
}
