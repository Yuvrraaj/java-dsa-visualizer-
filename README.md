🚀 Java DSA Visualizer

An interactive Data Structures & Algorithms Visualization Platform built using Java Spring Boot that helps users understand core data structures through real-time visual interaction.

🌐 Live Demo:
https://java-dsa-visualizer.onrender.com

------------------------------------------------------------------------------------------

📌 Project Overview

Java DSA Visualizer is a full-stack educational web application that visually demonstrates how fundamental data structures behave during operations like insertion, deletion, traversal, and searching.

Instead of learning algorithms only through theory, users interact with structures and observe how they change dynamically.

✨ Supported Data Structures
📦 Array / ArrayList

Insert elements dynamically

Delete elements

Index-based visualization

📚 Stack (LIFO)

Push operation

Pop operation

Visual stack behavior

🚶 Queue (FIFO)

Enqueue operation

Dequeue operation

Front and rear visualization

🔗 Singly Linked List

Insert nodes

Delete nodes

Pointer-based visualization

🌳 Binary Search Tree (BST)

Node insertion using BST rules

Automatic positioning

Canvas-based rendering

🕸️ Graph Visualizer

Click-to-create nodes

Connect nodes using edges

Interactive graph rendering

------------------------------------------------------------------------------------------

🏗️ Tech Stack
Backend

Java

Spring Boot

Spring MVC

Thymeleaf

Frontend

HTML5

CSS3

Vanilla JavaScript

HTML Canvas API

Deployment & DevOps

Docker

Render Cloud Platform

GitHub

------------------------------------------------------------------------------------------

📂 Project Structure

src/
    main/
        java/
            com/
                dsa/
                    controller/
                    model/
                    DsaVisualizerApplication.java

        resources/
            templates/        (Thymeleaf HTML pages)
            static/
                css/
                js/
            application.properties

Dockerfile
pom.xml
README.md

------------------------------------------------------------------------------------------

⚙️ Running the Project Locally
1️⃣ Clone Repository

git clone https://github.com/Yuvrraaj/java-dsa-visualizer-.git
cd java-dsa-visualizer-

2️⃣ Run Using Maven

Make sure Java 17+ and Maven are installed.
mvn spring-boot:run

3️⃣ Open in Browser
http://localhost:8080

🐳 Running with Docker
Build Docker Image
docker build -t dsa-visualizer .
Run Container
docker run -p 8080:8080 dsa-visualizer

Application runs at:

http://localhost:8080

------------------------------------------------------------------------------------------

🌍 Deployment

The application is deployed using Render Cloud Platform with Docker-based hosting.

Deployment Features

Automatic build on Git push

Containerized Spring Boot execution

HTTPS enabled public access

Continuous deployment workflow

Live URL:

https://java-dsa-visualizer.onrender.com

------------------------------------------------------------------------------------------


🎯 Learning Objectives

This project demonstrates:

Spring Boot MVC architecture

Backend–frontend integration

Visualization logic using JavaScript

Canvas-based rendering systems

Cloud deployment workflow

Production debugging experience

------------------------------------------------------------------------------------------

🚧 Future Improvements

Tree traversal animations

BFS & DFS graph traversal visualization

Drag-and-drop graph nodes

Step-by-step algorithm animation

Performance comparison mode

Dark mode UI

------------------------------------------------------------------------------------------

👨‍💻 Author

Yuvraj Jha
3rd Year Student — Vellore Institute of Technology

Interests

Data Structures & Algorithms

Machine Learning

Visualization Systems

Backend Engineering

GitHub: https://github.com/Yuvrraaj

------------------------------------------------------------------------------------------

🤝 Contributing

Fork the repository

Create a feature branch

Commit your changes

Open a Pull Request

------------------------------------------------------------------------------------------

📜 License

Licensed under the MIT License.

------------------------------------------------------------------------------------------

🙌 Acknowledgements

Inspired by interactive algorithm learning platforms that make complex data structures easier to understand through visualization.

✅ After pasting:
git add README.md
git commit -m "Fix README formatting"
git push
