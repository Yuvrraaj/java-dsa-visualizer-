# 🚀 Java DSA Visualizer

An interactive **Data Structures & Algorithms Visualization Platform** built using **Java Spring Boot** that helps users understand core data structures through real-time visual interaction.

🌐 **Live Demo:**  
👉 https://java-dsa-visualizer.onrender.com

---

## 📌 Project Overview

**Java DSA Visualizer** is a full-stack educational web application designed to visually demonstrate how fundamental data structures behave during different operations.

Instead of learning algorithms purely through theory, users can perform operations and instantly observe how the internal structure changes.

This project combines:

- Algorithm learning through visualization
- Spring Boot backend development
- Interactive frontend rendering
- Real-world deployment using Docker and cloud hosting

---

## ✨ Supported Data Structures

### 📦 Array / ArrayList
- Insert elements dynamically
- Delete elements
- Visual index-based representation
- Demonstrates contiguous memory behavior

---

### 📚 Stack (LIFO – Last In First Out)
- Push operation
- Pop operation
- Visual stack growth and shrinkage
- Highlights top element behavior

---

### 🚶 Queue (FIFO – First In First Out)
- Enqueue operation
- Dequeue operation
- Front and rear visualization
- Sequential processing demonstration

---

### 🔗 Singly Linked List
- Insert at tail
- Delete operations
- Node-by-node visualization
- Pointer-based structure understanding

---

### 🌳 Binary Search Tree (BST)
- Insert nodes following BST rules
- Automatic positioning of nodes
- Parent–child relationships visualized
- Tree structure rendered using HTML Canvas

---

### 🕸️ Graph Visualizer
- Click-to-create graph nodes
- Connect nodes using edges
- Interactive canvas rendering
- Demonstrates adjacency relationships

---

## 🧠 Concepts Demonstrated

- Data Structure Operations
- Algorithm Behavior Visualization
- Event-driven Programming
- DOM Manipulation
- Canvas Rendering
- MVC Web Architecture
- Interactive UI Design

---

## 🏗️ Tech Stack

### Backend
- **Java**
- **Spring Boot**
- Spring MVC Architecture
- Thymeleaf Template Engine

### Frontend
- HTML5
- CSS3
- Vanilla JavaScript
- HTML Canvas API

### Deployment & DevOps
- Docker
- Render Cloud Platform
- GitHub Version Control

java-dsa-visualizer/
│
├── src/
│ └── main/
│ ├── java/
│ │ └── com/
│ │ └── dsa/
│ │ ├── controller/
│ │ ├── model/
│ │ └── DsaVisualizerApplication.java
│ │
│ └── resources/
│ ├── templates/ # Thymeleaf HTML pages
│ ├── static/
│ │ ├── css/
│ │ └── js/
│ └── application.properties
│
├── Dockerfile
├── pom.xml
└── README.md


---

## ⚙️ Running the Project Locally

### 1️⃣ Clone the Repository

bash
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

Live URL:

👉 https://java-dsa-visualizer.onrender.com

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

BFS and DFS graph traversal visualization

Drag-and-drop graph nodes

Step-by-step algorithm animation timeline

Performance comparison between structures

Dark mode UI

Modular JavaScript architecture

👨‍💻 Author

Yuvraj Jha
3rd Year Student — Vellore Institute of Technology

Interests:

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
---

## 📂 Project Structure
