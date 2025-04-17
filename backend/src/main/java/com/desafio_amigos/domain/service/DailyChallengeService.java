package com.desafio_amigos.domain.service;

import com.desafio_amigos.domain.entity.DailyChallengeEntity;
import com.desafio_amigos.domain.repository.IDailyChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DailyChallengeService {

    @Autowired
    private IDailyChallengeRepository dailyChallengeRepository;

    public DailyChallengeEntity create(DailyChallengeEntity challenge) {
        return dailyChallengeRepository.save(challenge);
    }

    public List<DailyChallengeEntity> findByUserId(Long userId) {
        return dailyChallengeRepository.findByUserId(userId);
    }

    public List<DailyChallengeEntity> findAll() {
        return dailyChallengeRepository.findAll();
    }
}
