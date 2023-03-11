package com.example.issuetracking.web.issue;

import com.example.issuetracking.domain.issue.IssueEntity;
import com.example.issuetracking.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {

    private final IssueService issueService;

    @Autowired
    public IssueController(IssueService issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/issues")
    public String showList(Model model){
        var issueList = issueService.findAll();
        model.addAttribute("issueList", issueList);
        return "issues/list.html";
    }
}
