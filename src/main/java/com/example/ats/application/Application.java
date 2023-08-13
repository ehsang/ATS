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
@Table(name = "applications")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //    @ManyToOne
//    @JoinColumn(referencedColumnName = "candidate_id")
//    private Candidate candidate;
//

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "JobPosting_id", nullable = false)
    private JobPosting jobPosting;

    private LocalDate appliedDate;

    private String status; // e.g., "Pending", "Accepted", "Rejected"

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "candidateId", nullable = false)
    private Candidate candidate;

}
