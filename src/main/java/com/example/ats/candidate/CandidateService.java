package com.example.ats.candidate;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateService {


    private final CandidateRepository candidateRepository;

    @Autowired
    public CandidateService(CandidateRepository candidateRepository){
        this.candidateRepository = candidateRepository;
    }

    public Candidate addCandidate(Candidate candidate){
        return candidateRepository.save(candidate);
    }

    public Candidate getCandidate(Long id){
        return candidateRepository.findById(id).orElse(null);
    }

}
