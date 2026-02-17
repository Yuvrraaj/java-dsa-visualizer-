package com.dsa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TopicController {

    @GetMapping("/topics")
    public String topics() {
        return "topics";
    }

    @GetMapping("/visualization")
    public String visualization() {
        return "visualization";
    }

    @GetMapping("/topic/arrays")
    public String arrays() {
        return "array-topic";
    }

    @GetMapping("/topic/stack")
    public String stack() {
        return "stack-topic";
    }

    @GetMapping("/arrays")
    public String arraysHome(){
        return "arrays";
    }

    @GetMapping("/arrays/operations")
    public String arrayOperations() {
        return "arrays-operations";
    }

    @GetMapping("/arrays/techniques")
    public String arrayTechniques() {
        return "arrays-techniques";
    }

    @GetMapping("/arrays/patterns")
    public String arrayPatterns() {
        return "arrays-patterns";
    }



}
