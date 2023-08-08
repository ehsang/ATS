package com.example.ats.user;

import com.example.ats.jobposting.JobPosting;
import com.example.ats.jobposting.JobPostingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public User addUser(User user) {
        return userRepository.save(user);

    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
