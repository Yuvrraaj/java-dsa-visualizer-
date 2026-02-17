package com.dsa.service;

import com.dsa.model.Question;
import com.dsa.repository.QuestionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    private final QuestionRepository repo;

    public QuestionService(QuestionRepository repo) {
        this.repo = repo;
    }

    public List<Question> getAllQuestions() {
        return repo.findAll();
    }

    public void saveQuestion(Question q) {
        repo.save(q);
    }
}
