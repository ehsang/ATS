package com.example.ats.jobposting;

import com.example.ats.candidate.Candidate;
import com.example.ats.candidate.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobPostingService {


    private final JobPostingRepository jobPostingRepository;

    @Autowired
    public JobPostingService(JobPostingRepository jobPostingRepository) {
        this.jobPostingRepository = jobPostingRepository;
    }

    public JobPosting addJobPosting(JobPosting jobPosting) {
        return jobPostingRepository.save(jobPosting);

    }

    public JobPosting getJobPosting(Long id) {
        return jobPostingRepository.findById(id).orElse(null);
    }

}
