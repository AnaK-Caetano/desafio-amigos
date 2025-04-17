package com.desafio_amigos.domain.service;

import com.desafio_amigos.domain.entity.QuickMatchEntity;
import com.desafio_amigos.domain.repository.IQuickMatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class QuickMatchService {

    @Autowired
    private IQuickMatchRepository quickMatchRepository;

    public QuickMatchEntity createQuickMatch(QuickMatchEntity quickMatch) {
      quickMatch.setCode(generateQuickMatchCode()); 
      quickMatch.setCreationDate(LocalDateTime.now()); 
      return quickMatchRepository.save(quickMatch); // Salva o objeto no banco
    }

    public Optional<QuickMatchEntity> getQuickMatchByCode(String code) {
        return quickMatchRepository.findByCode(code);
    }

    private String generateQuickMatchCode() {
        long count = quickMatchRepository.count() + 1;
        return "a" + String.format("%03d", count);
    }

    public QuickMatchEntity findByCode(String code) {
      return quickMatchRepository.findByCode(code)
              .orElseThrow(() -> new RuntimeException("QuickMatch não encontrado"));
  }
}
