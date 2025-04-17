package com.desafio_amigos.domain.controller;

import com.desafio_amigos.domain.entity.SubmissionEntity;
import com.desafio_amigos.domain.service.SubmissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/submissions")
@RequiredArgsConstructor
public class SubmissionController {

    private final SubmissionService submissionService;

    @PostMapping
    public ResponseEntity<SubmissionEntity> submitCode(@RequestBody SubmissionEntity submission) {
        return ResponseEntity.ok(submissionService.save(submission));
    }

    @GetMapping("/by-user/{userId}")
    public ResponseEntity<List<SubmissionEntity>> getByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(submissionService.findByUserId(userId));
    }
}
