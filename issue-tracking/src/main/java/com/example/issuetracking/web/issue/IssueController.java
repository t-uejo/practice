package com.example.issuetracking.web.issue;

import com.example.issuetracking.domain.issue.IssueEntity;
import com.example.issuetracking.domain.issue.IssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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

    @GetMapping("/issues/creationForm")
    public String showCreationForm(@ModelAttribute IssueForm issueForm){
        return "issues/creationForm.html";
    }

    @PostMapping("/issues")
    public String create(IssueForm issueForm, Model model){
        issueService.create(issueForm.getSummary(), issueForm.getDescription());
        return "redirect:/issues";
    }
}
