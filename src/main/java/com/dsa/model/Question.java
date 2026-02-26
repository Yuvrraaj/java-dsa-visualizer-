package com.dsa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String topic;
    private String difficulty;
    private String problemLink;
    
    // NEW: We use TEXT instead of VARCHAR because descriptions are long!
    @Column(columnDefinition = "TEXT")
    private String description;
    
    public Question() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getTopic() { return topic; }
    public void setTopic(String topic) { this.title = topic; }
    public String getDifficulty() { return difficulty; }
    public void setDifficulty(String difficulty) { this.difficulty = difficulty; }
    public String getProblemLink() { return problemLink; }
    public void setProblemLink(String problemLink) { this.problemLink = problemLink; }
    
    // NEW: Getter and Setter for description
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
}