package com.desafio_amigos.domain.controller;

import com.desafio_amigos.domain.entity.ChallengeEntity;
import com.desafio_amigos.domain.service.ChallengeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/challenges")
@RequiredArgsConstructor
public class ChallengeController {

    private final ChallengeService challengeService;

    @GetMapping("/random")
    public ResponseEntity<ChallengeEntity> getRandomChallenge() {
        return ResponseEntity.ok(challengeService.findRandomChallenge());
    }

    @PostMapping
    public ResponseEntity<ChallengeEntity> createChallenge(@RequestBody ChallengeEntity challenge) {
        return ResponseEntity.ok(challengeService.save(challenge));
    }

    @GetMapping
    public ResponseEntity<List<ChallengeEntity>> getAllChallenges() {
        return ResponseEntity.ok(challengeService.findAll());
    }
}
