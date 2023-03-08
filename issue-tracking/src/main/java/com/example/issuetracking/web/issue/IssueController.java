package com.example.issuetracking.web.issue;

import com.example.issuetracking.domain.issue.IssueEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {
    @GetMapping("/issues")
    public String showList(Model model){
        var issueList = List.of(
                new IssueEntity(1, "概要１", "説明１"),
                new IssueEntity(2, "概要２", "説明２"),
                new IssueEntity(3, "概要３", "説明３")
        );
        model.addAttribute("issueList", issueList);
        return "list.html";
    }
}
