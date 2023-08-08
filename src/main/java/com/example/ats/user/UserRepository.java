package com.example.ats.user;

import com.example.ats.jobposting.JobPosting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
