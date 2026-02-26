package com.dsa.service;

import com.dsa.model.Question;
import com.dsa.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    // Fetches ALL questions for the main /questions page
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }

    // Fetches questions for a specific topic (e.g., Arrays only)
    public List<Question> getQuestionsByTopic(String topic) {
        return questionRepository.findByTopicIgnoreCase(topic);
    }

    public Question saveQuestion(Question question) {
        return questionRepository.save(question);
    }

    // Add this to QuestionService.java
    public Question getQuestionById(Long id) {
        return questionRepository.findById(id).orElse(null);
    }
}