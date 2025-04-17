package com.desafio_amigos.domain.service;

import com.desafio_amigos.domain.entity.SubmissionEntity;
import com.desafio_amigos.domain.repository.ISubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubmissionService {

    @Autowired
    private ISubmissionRepository submissionRepository;

    public SubmissionEntity createSubmission(SubmissionEntity submissionEntity) {
        return submissionRepository.save(submissionEntity);
    }

    public SubmissionEntity getSubmissionById(Long id) {
        return submissionRepository.findById(id).orElse(null);
    }

    public void deleteSubmission(Long id) {
        submissionRepository.deleteById(id);
    }

    public SubmissionEntity save(SubmissionEntity submission) {
        return submissionRepository.save(submission);
    }

    public List<SubmissionEntity> findByUserId(Long userId) {
        return submissionRepository.findByUserId(userId);
    }
}
