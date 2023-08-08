package com.example.ats.jobposting;

import com.example.ats.candidate.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobPostingRepository extends JpaRepository<JobPosting, Long> {

}
