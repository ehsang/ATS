package com.example.ats.user;

import com.example.ats.utils.PasswordEncoderUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public User addUser(UserRegistrationDTO registrationDTO) {
        if (userRepository.findByUsername(registrationDTO.getUserName()).isPresent()){
            throw new RuntimeException("User with this username already exists!"); // Consider using a custom exception.
        }

        User newUser = new User();

        //Hash the password before saving the User
        String hashedPassword = PasswordEncoderUtil.hashPassword(registrationDTO.getPassword());
        newUser.setPassword(hashedPassword);

        newUser.setEmail(registrationDTO.getEmail());
        newUser.setLastLogin(registrationDTO.getLastLogin());
        newUser.setRole(registrationDTO.getRole());
        newUser.setUsername(registrationDTO.getUserName());

        return userRepository.save(newUser);

    }

    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }

}
