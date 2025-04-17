package com.desafio_amigos.domain.repository;


import com.desafio_amigos.domain.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Long> {
}
