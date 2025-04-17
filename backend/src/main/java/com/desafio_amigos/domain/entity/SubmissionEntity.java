package com.desafio_amigos.domain.entity;

import jakarta.persistence.*;
import lombok.Data;
import com.desafio_amigos.domain.entity.UserEntity; 
import org.springframework.boot.autoconfigure.security.SecurityProperties;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_submission")
@Data
public class SubmissionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String submittedCode;
    private LocalDateTime date;

    @ManyToOne
    private UserEntity user;

    @ManyToOne
    private DailyChallengeEntity challenge;
}
