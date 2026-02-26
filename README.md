🚀 Java DSA Visualizer

An interactive Data Structures & Algorithms Visualization Platform built using Java Spring Boot, designed to help users understand core data structures through real-time visual interaction.

🌐 Live Demo
👉 https://java-dsa-visualizer.onrender.com

📌 Project Overview

Java DSA Visualizer is a full-stack educational web application that visually demonstrates how fundamental data structures behave during operations such as insertion, deletion, traversal, and search.

Instead of learning algorithms only through theory, users can interact with structures and observe structural changes dynamically.

This project combines:

Algorithm learning through visualization

Spring Boot backend development

Interactive frontend rendering

Real-world cloud deployment

✨ Supported Data Structures
📦 Array / ArrayList

Insert elements dynamically

Delete elements

Index-based visualization

Demonstrates contiguous memory behavior

📚 Stack (LIFO – Last In First Out)

Push operation

Pop operation

Visual stack growth and shrinkage

Highlights top element behavior

🚶 Queue (FIFO – First In First Out)

Enqueue operation

Dequeue operation

Front and rear visualization

🔗 Singly Linked List

Insert nodes

Delete nodes

Pointer-based visualization

Sequential traversal understanding

🌳 Binary Search Tree (BST)

Node insertion using BST rules

Automatic node positioning

Parent–child visualization

Canvas-based rendering

🕸️ Graph Visualizer

Click-to-create nodes

Connect nodes using edges

Interactive graph rendering

Adjacency relationship visualization

🧠 Concepts Demonstrated

Data Structure Operations

Algorithm Visualization

DOM Manipulation

Event-driven Programming

Canvas Rendering

MVC Architecture

Full-stack Deployment Workflow

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

📂 Project Structure
java-dsa-visualizer/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── dsa/
│       │           ├── controller/
│       │           ├── model/
│       │           └── DsaVisualizerApplication.java
│       │
│       └── resources/
│           ├── templates/        # Thymeleaf HTML pages
│           ├── static/
│           │   ├── css/
│           │   └── js/
│           └── application.properties
│
├── Dockerfile
├── pom.xml
└── README.md

⚙️ Running the Project Locally
1️⃣ Clone the Repository
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

🌍 Deployment

The application is deployed using Render Cloud Platform with Docker-based hosting.

Deployment Features

Automatic build on Git push

Containerized Spring Boot execution

HTTPS enabled public access

Continuous deployment workflow

🔗 Live URL:
https://java-dsa-visualizer.onrender.com

🎯 Learning Objectives

This project demonstrates practical understanding of:

Spring Boot MVC architecture

Backend–frontend integration

Visualization logic using JavaScript

Canvas-based rendering systems

Cloud deployment workflow

Debugging production deployment issues

🚧 Future Improvements

Tree traversal animations (Inorder / Preorder / Postorder)

BFS & DFS graph traversal visualization

Drag-and-drop graph nodes

Step-by-step algorithm animation timeline

Performance comparison mode

Dark mode UI

Modular JavaScript architecture

👨‍💻 Author

Yuvraj Jha
3rd Year Student — Vellore Institute of Technology

Interests

Data Structures & Algorithms

Machine Learning

Visualization Systems

Backend Engineering

GitHub: https://github.com/Yuvrraaj

🤝 Contributing

Contributions and suggestions are welcome!

Fork the repository

Create a feature branch

Commit your changes

Open a Pull Request

📜 License

This project is licensed under the MIT License.

🙌 Acknowledgements

Inspired by interactive algorithm learning platforms that make complex data structures easier to understand through visualization and experimentation.

✅ Now just:
git add README.md
git commit -m "Final structured README"
git push
