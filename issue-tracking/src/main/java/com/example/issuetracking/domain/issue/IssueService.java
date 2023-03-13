package com.example.issuetracking.domain.issue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IssueService {
    private final IssueRepository issueRepository;

    @Autowired
    public IssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    public List<IssueEntity> findAll() {
        return issueRepository.findAll();
    }


    public void create(String summary, String description) {
        issueRepository.insert(summary, description);
    }
}
