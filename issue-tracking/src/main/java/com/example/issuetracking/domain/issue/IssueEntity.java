package com.example.issuetracking.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@AllArgsConstructor
public class IssueEntity {
    @Getter
    private long id;
    @Getter
    private String summary;
    @Getter
    private String description;
}
