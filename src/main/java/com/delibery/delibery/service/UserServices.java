package com.delibery.delibery.service;

import com.delibery.delibery.entity.User;
import com.delibery.delibery.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServices {
    private final UserRepository userRepository;
    public User save(User user) {
        return userRepository.save(user);
    }
    public Optional<User> getUserById(Long id) {
        return userRepository.findById(id);
    }
}
