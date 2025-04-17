package com.desafio_amigos.domain.repository;

import com.desafio_amigos.domain.entity.SubmissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ISubmissionRepository extends JpaRepository<SubmissionEntity, Long> {
    List<SubmissionEntity> findByUserId(Long userId);

}
