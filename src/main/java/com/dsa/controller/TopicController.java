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

    // STACK MAIN PAGE
    @GetMapping("/stack")
    public String stackHome(){
        return "stack";
    }

    @GetMapping("/stack/operations")
    public String stackOperations(){
        return "stack-operations";
    }

    @GetMapping("/stack/techniques")
    public String stackTechniques(){
        return "stack-techniques";
    }

    @GetMapping("/stack/patterns")
    public String stackPatterns(){
        return "stack-patterns";
    }
    
    /* ================= LINKED LIST ================= */

    @GetMapping("/linkedlist")
    public String linkedListHome(){ return "linkedlist"; }

    @GetMapping("/linkedlist/operations")
    public String linkedListOps(){ return "linkedlist-operations"; }

    @GetMapping("/linkedlist/techniques")
    public String linkedListTech(){ return "linkedlist-techniques"; }

    @GetMapping("/linkedlist/patterns")
    public String linkedListPatterns(){ return "linkedlist-patterns"; }


    /* ================= QUEUE ================= */

    @GetMapping("/queue")
    public String queueHome(){ return "queue"; }

    @GetMapping("/queue/operations")
    public String queueOps(){ return "queue-operations"; }

    @GetMapping("/queue/techniques")
    public String queueTech(){ return "queue-techniques"; }

    @GetMapping("/queue/patterns")
    public String queuePatterns(){ return "queue-patterns"; }


    /* ================= ARRAYLIST ================= */

    @GetMapping("/arraylist")
    public String arrayListHome(){ return "arraylist"; }

    @GetMapping("/arraylist/operations")
    public String arrayListOps(){ return "arraylist-operations"; }

    @GetMapping("/arraylist/techniques")
    public String arrayListTech(){ return "arraylist-techniques"; }

    @GetMapping("/arraylist/patterns")
    public String arrayListPatterns(){ return "arraylist-patterns"; }


    /* ================= DEQUE ================= */

    @GetMapping("/deque")
    public String dequeHome(){ return "deque"; }

    @GetMapping("/deque/operations")
    public String dequeOps(){ return "deque-operations"; }

    @GetMapping("/deque/techniques")
    public String dequeTech(){ return "deque-techniques"; }

    @GetMapping("/deque/patterns")
    public String dequePatterns(){ return "deque-patterns"; }

/* ================= TREES ================= */

@GetMapping("/trees")
public String treeHome(){ 
    return "trees"; 
}

@GetMapping("/trees/operations")
public String treeOps(){ 
    return "trees-operations";   // ✅ FIXED
}

@GetMapping("/trees/techniques")
public String treeTech(){ 
    return "trees-techniques";   // ✅ FIXED
}

@GetMapping("/trees/patterns")
public String treePatterns(){ 
    return "trees-patterns";     // ✅ FIXED
}

    /* ================= GRAPH ================= */

    @GetMapping("/graph")
    public String graphHome(){ return "graph"; }

    @GetMapping("/graph/operations")
    public String graphOps(){ return "graph-operations"; }

    @GetMapping("/graph/techniques")
    public String graphTech(){ return "graph-techniques"; }

    @GetMapping("/graph/patterns")
    public String graphPatterns(){ return "graph-patterns"; }

}
