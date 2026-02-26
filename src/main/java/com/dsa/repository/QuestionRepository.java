package com.dsa.repository;

import com.dsa.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    // Custom query to fetch questions by their DSA topic
    List<Question> findByTopicIgnoreCase(String topic);
}