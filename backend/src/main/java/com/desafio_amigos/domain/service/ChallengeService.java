package com.desafio_amigos.domain.service;


import com.desafio_amigos.domain.entity.ChallengeEntity;
import com.desafio_amigos.domain.repository.IChallengeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChallengeService {

    @Autowired
    private IChallengeRepository challengeRepository;

    public ChallengeEntity getRandomChallenge() {
        return challengeRepository.findRandomChallenge();
    }

    public ChallengeEntity createChallenge(ChallengeEntity challengeEntity) {
        return challengeRepository.save(challengeEntity);
    }

    public ChallengeEntity findRandomChallenge() {
        return challengeRepository.findRandomChallenge();
    }

    public ChallengeEntity save(ChallengeEntity challenge) {
        return challengeRepository.save(challenge);
    }

    public List<ChallengeEntity> findAll() {
        return challengeRepository.findAll();
    }
}
