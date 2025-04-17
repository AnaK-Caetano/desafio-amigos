package com.desafio_amigos.domain.controller;

import com.desafio_amigos.domain.entity.DailyChallengeEntity;
import com.desafio_amigos.domain.service.DailyChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/daily-challenges")
@RequiredArgsConstructor
public class DailyChallengeController {

    private final DailyChallengeService dailyChallengeService;

    @PostMapping
    public ResponseEntity<DailyChallengeEntity> create(@RequestBody DailyChallengeEntity challenge) {
        return ResponseEntity.ok(dailyChallengeService.create(challenge));
    }

    @GetMapping("/by-user/{userId}")
    public ResponseEntity<List<DailyChallengeEntity>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(dailyChallengeService.findByUserId(userId));
    }

    @GetMapping
    public ResponseEntity<List<DailyChallengeEntity>> getAll() {
        return ResponseEntity.ok(dailyChallengeService.findAll());
    }
}
