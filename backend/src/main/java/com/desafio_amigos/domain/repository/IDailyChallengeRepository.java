package com.desafio_amigos.domain.repository;

import com.desafio_amigos.domain.entity.DailyChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.desafio_amigos.domain.entity.DailyChallengeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IDailyChallengeRepository extends JpaRepository<DailyChallengeEntity, Long> {
    List<DailyChallengeEntity> findByUserId(Long userId);
}