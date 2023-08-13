package com.example.ats.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ApplicationService {


    private final ApplicationRepository applicationRepository;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application addApplication(Application application) {
        return applicationRepository.save(application);

    }

    public Optional<Application> getApplicationById(Long id) {
        return applicationRepository.findById(id);
    }

}
