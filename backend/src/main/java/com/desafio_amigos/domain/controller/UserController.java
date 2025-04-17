package com.desafio_amigos.domain.controller;

import com.desafio_amigos.domain.entity.DailyChallengeEntity;
import com.desafio_amigos.domain.entity.UserEntity;
import com.desafio_amigos.domain.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserEntity> createUser(@RequestBody UserEntity user) {
        return ResponseEntity.ok(userService.save(user));
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<UserEntity>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }
}