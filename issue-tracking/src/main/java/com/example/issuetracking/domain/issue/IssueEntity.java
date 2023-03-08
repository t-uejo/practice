package com.example.issuetracking.domain.issue;

public class IssueEntity {
    private long id;
    private String summary;
    private String description;

    public IssueEntity(long id, String summary, String description) {
        this.id = id;
        this.summary = summary;
        this.description = description;
    }

    public long getId() {
        return id;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }
}
