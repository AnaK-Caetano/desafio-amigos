package com.desafio_amigos.domain.service;

import com.desafio_amigos.domain.entity.UserEntity;
import com.desafio_amigos.domain.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private IUserRepository userRepository;

    public UserEntity getUserById(Long id) {
        Optional<UserEntity> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public UserEntity updateUser(Long id, UserEntity userEntity) {
        if (userRepository.existsById(id)) {
            userEntity.setId(id);
            return userRepository.save(userEntity);
        }
        return null;
    }

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<UserEntity> findAll() {
        return userRepository.findAll();
    }
}
