package com.dsa.controller;

import com.dsa.model.Question;
import com.dsa.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/questions")
    public String getAllQuestions(Model model) {
        model.addAttribute("topicName", "All");
        model.addAttribute("questions", questionService.getAllQuestions());
        return "questions";
    }

    @GetMapping("/practice/{topic}")
    public String getPracticeQuestions(@PathVariable String topic, Model model) {
        model.addAttribute("topicName", topic.substring(0, 1).toUpperCase() + topic.substring(1));
        model.addAttribute("questions", questionService.getQuestionsByTopic(topic));
        return "questions";
    }

    // ✅ ROUTE 1: Specific Question Mode (e.g., /solve/1)
    @GetMapping("/solve/{id}")
    public String solveQuestion(@PathVariable Long id, Model model) {
        Question question = questionService.getQuestionById(id);
        if (question == null) {
            return "redirect:/questions";
        }
        model.addAttribute("question", question);
        return "solve";
    }

    // ✅ ROUTE 2: Free Sandbox Mode (e.g., /solve)
    @GetMapping("/solve")
    public String solveSandbox(Model model) {
        // Pass a null question so the HTML knows we are in Sandbox mode
        model.addAttribute("question", null);
        return "solve";
    }

    @GetMapping("/admin/add-question")
    public String showAddQuestionForm(Model model) {
        model.addAttribute("question", new Question());
        return "add-question";
    }

    @PostMapping("/admin/add-question")
    public String addQuestion(@ModelAttribute Question question) {
        if (question.getProblemLink() == null || question.getProblemLink().isEmpty()) {
            question.setProblemLink("/solve");
        }
        questionService.saveQuestion(question);
        return "redirect:/questions";
    }
}