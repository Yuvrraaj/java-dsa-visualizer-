package com.dsa.controller;

import com.dsa.model.Question;
import com.dsa.service.QuestionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {

    private final QuestionService service;

    public QuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/questions")
    public String questions(Model model) {
        model.addAttribute("questions", service.getAllQuestions());
        return "questions";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("question", new Question());
        return "add-question";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Question q) {
        service.saveQuestion(q);
        return "redirect:/questions";
    }
}
