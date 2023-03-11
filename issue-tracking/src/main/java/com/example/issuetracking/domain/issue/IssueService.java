package com.example.issuetracking.domain.issue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {
    public List<IssueEntity> findAll() {
        return List.of(
                new IssueEntity(1, "概要１", "説明１"),
                new IssueEntity(2, "概要２", "説明２"),
                new IssueEntity(3, "概要３", "説明３")
        );
    }
}