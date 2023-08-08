package com.example.ats.application;

import com.example.ats.candidate.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationRepository extends JpaRepository<Application, Long> {

}
