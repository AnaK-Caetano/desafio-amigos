package com.desafio_amigos.domain.repository;

import com.desafio_amigos.domain.entity.QuickMatchEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IQuickMatchRepository extends JpaRepository<QuickMatchEntity, Long> {
    Optional<QuickMatchEntity> findByCode(String code);
}