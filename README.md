# 📘 DSA Visualizer & Learning Platform

An interactive **Data Structures & Algorithms learning platform** built using **Java (Spring Boot)** that combines structured theory, Java implementations, and visual algorithm simulations in a single environment.

The objective of this project is to make DSA concepts **intuitive, visual, and implementation-focused**, enabling learners to understand *how algorithms work internally* rather than memorizing solutions.

---

## 🚀 Overview

This platform acts as a mini educational ecosystem where users can:

- 📖 Learn data structures through structured explanations
- 💻 Study Java implementations alongside theory
- 🎯 Understand common problem-solving patterns
- 🎬 Visualize operations interactively
- 🧠 Practice curated problem

Unlike traditional tutorial websites, this project focuses on **visual intuition + practical coding understanding**.

---

## ✨ Current Features

### 🏠 Modern Landing Experience
- Animated hero landing page
- Clean platform-style UI
- Structured navigation between learning and visualization sections

### 📚 Learning Modules (Implemented)
**Arrays Module**
- Conceptual introduction
- Operations explanation
- Techniques & approaches
- Problem-solving patterns
- Java implementation examples

### 🎬 Visualization Lab
- Memory-cell style array visualization
- Animated traversal
- Insert/Delete simulations
- Interactive real-time animations using JavaScript

### 🧩 Practice Section
- Question & solution posting system
- Backend persistence using Spring Data JPA

---

## 🏗️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring MVC
- Spring Data JPA
- H2 Database

### Frontend
- Thymeleaf
- HTML5
- CSS3 (Custom UI)
- Vanilla JavaScript Animations

### Architecture
- MVC (Model–View–Controller)
- Layered Service Architecture

---

dsa-visualizer/
│
├── src/main/java/com/dsa
│ ├── controller/ # Web routing & controllers
│ ├── service/ # Business logic layer
│ ├── repository/ # Database access layer
│ ├── model/ # Entity classes
│ └── DsaVisualizerApplication.java
│
├── src/main/resources
│ ├── templates/ # Thymeleaf UI pages
│ ├── static/
│ │ ├── css/ # Styling
│ │ └── js/ # Visualizations & animations
│ └── application.properties
│
└── pom.xml


---

## ▶️ Running the Project Locally

### 1️⃣ Clone Repository

bash
git clone https://github.com/<your-username>/dsa-visualizer.git
cd dsa-visualizer

2️⃣ Build & Run
mvn clean install
mvn spring-boot:run

3️⃣ Open in Browser
http://localhost:8080

🎯 Project Vision

The long-term goal is to evolve this into a complete interactive DSA learning platform combining:

Visual algorithm simulations

Pattern-based interview preparation

Step-by-step execution playback

Concept-first learning methodology

The focus is on developing deep algorithmic intuition rather than rote memorization.

| Module                       | Status         |
| ---------------------------- | -------------- |
| Platform Architecture        | ✅ Completed    |
| Landing & Dashboard UI       | ✅ Completed    |
| Arrays Learning Module       | ✅ Implemented  |
| Visualization Engine (Basic) | ✅ Implemented  |
| Practice System              | ✅ Working      |
| Additional Data Structures   | 🚧 In Progress |


🔮 Planned Enhancements

Stack, Queue, Linked List modules

Tree & Graph visualizers

Advanced algorithm animations

Step-by-step execution engine

User progress tracking

Interactive coding playground

👨‍💻 Author

Yuvraj Jha
## 📂 Project Structure

