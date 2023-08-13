package com.example.ats.candidate;

import javax.persistence.*;

import com.example.ats.application.Application;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;
    private String resumePath; //Store the path to the resume rather than the file itself

    @OneToOne(mappedBy = "candidate", cascade = CascadeType.ALL)
    private Application application;


}
