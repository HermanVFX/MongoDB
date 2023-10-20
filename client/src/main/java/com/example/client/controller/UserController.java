package com.example.client.controller;

import com.example.client.model.User;
import com.example.client.repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserRepo repo;

    @GetMapping
    List<User> getAllUser() {
        return repo.findAll();
    }
}
