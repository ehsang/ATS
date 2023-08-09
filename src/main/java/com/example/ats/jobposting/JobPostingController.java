package com.example.ats.jobposting;

import com.example.ats.candidate.Candidate;
import com.example.ats.candidate.CandidateService;
import com.example.ats.jobposting.JobPosting;
import com.example.ats.jobposting.JobPostingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/job-postings")
public class JobPostingController {


    private final JobPostingService jobPostingService;

    @Autowired
    public JobPostingController(JobPostingService jobPostingService) {
        this.jobPostingService = jobPostingService;

    }

    @GetMapping("/{id}")
    public ResponseEntity<JobPosting> getJobPosting(@PathVariable Long id) {
        JobPosting jobPosting = jobPostingService.getJobPosting(id);
        if (jobPosting != null) {
            return ResponseEntity.ok(jobPosting);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<JobPosting> addJobPosting(@RequestBody JobPosting jobPosting) {
        JobPosting savedJobPosting = jobPostingService.addJobPosting(jobPosting);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedJobPosting);
    }

    // Other endpoints like update, delete, etc.
}

