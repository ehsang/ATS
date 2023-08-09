package com.example.ats.application;

import com.example.ats.candidate.Candidate;
import com.example.ats.candidate.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/applications")
public class ApplicationController {


    private final CandidateService candidateService;

    @Autowired
    public ApplicationController(CandidateService candidateService){
        this.candidateService = candidateService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Candidate> getCandidate(@PathVariable Long id) {
        Candidate candidate = candidateService.getCandidate(id);
        if (candidate != null) {
            return ResponseEntity.ok(candidate);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Candidate> addCandidate(@RequestBody Candidate candidate) {
        Candidate savedCandidate = candidateService.addCandidate(candidate);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCandidate);
    }

    // Other endpoints like update, delete, etc.
}

