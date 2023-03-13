package com.example.issuetracking.web.issue;

import lombok.Data;

//Lombokでgetter,setterを作成
@Data
public class IssueForm {
    private String summary;
    private String description;
}
