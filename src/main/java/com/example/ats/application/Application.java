package com.example.ats.application;

import com.example.ats.candidate.Candidate;
import com.example.ats.jobposting.JobPosting;
import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(referencedColumnName = "candidate_id")
//    private Candidate candidate;
//
//    @ManyToOne
//    @JoinColumn(referencedColumnName = "job_posting_id")
//    private JobPosting jobPosting;

    private LocalDate appliedDate;

    private String status; // e.g., "Pending", "Accepted", "Rejected"

}
