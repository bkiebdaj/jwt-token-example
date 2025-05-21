package org.bkiebdaj.jwtexample.services;

import org.bkiebdaj.jwtexample.entities.User;
import org.bkiebdaj.jwtexample.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> allUsers() {
        return userRepository.findAll();
    }
}
