package com.desafio_amigos.domain.controller;

import com.desafio_amigos.domain.entity.QuickMatchEntity;
import com.desafio_amigos.domain.service.QuickMatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/quick-matches")
@RequiredArgsConstructor
public class QuickMatchController {

    private final QuickMatchService quickMatchService;

    @PostMapping
    public ResponseEntity<QuickMatchEntity> createQuickMatch(@RequestBody QuickMatchEntity quickMatch) {
      QuickMatchEntity createdQuickMatch = quickMatchService.createQuickMatch(quickMatch);
      return ResponseEntity.ok(createdQuickMatch); // Retorna o QuickMatch criado
    }

    @GetMapping("/{code}")
    public ResponseEntity<QuickMatchEntity> getByCode(@PathVariable String code) {
      QuickMatchEntity quickMatch = quickMatchService.findByCode(code);
      return ResponseEntity.ok(quickMatch);
    }
}