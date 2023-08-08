package com.example.ats.application;

import com.example.ats.jobposting.JobPosting;
import com.example.ats.jobposting.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class applicationService {


    private final ApplicationRepository applicationRepository;

    @Autowired
    public applicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application addApplication(Application application) {
        return applicationRepository.save(application);

    }

    public Application getApplication(Long id) {
        return applicationRepository.findById(id).orElse(null);
    }

}
