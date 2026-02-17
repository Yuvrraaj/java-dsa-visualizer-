package com.dsa.model;

import jakarta.persistence.*;

@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String topic;

    @Column(length = 5000)
    private String description;

    @Column(length = 5000)
    private String answer;

    public Question() {}

    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getTopic() { return topic; }
    public String getDescription() { return description; }
    public String getAnswer() { return answer; }

    public void setTitle(String title) { this.title = title; }
    public void setTopic(String topic) { this.topic = topic; }
    public void setDescription(String description) { this.description = description; }
    public void setAnswer(String answer) { this.answer = answer; }
}
