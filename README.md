# Java DSA Visualizer & Practice Lab

**Live Demo:** [https://java-dsa-visualizer.onrender.com/](https://java-dsa-visualizer.onrender.com/)

A full-stack web application built with **Java** and **Spring Boot** designed to help developers master Data Structures and Algorithms (DSA). Rather than just providing text-based tutorials, this platform combines interactive graphical visualizations with a fully functional, integrated Java compiler. Users can learn the theory, watch how the memory and pointers behave in real-time, and immediately test their knowledge by solving coding problems directly in the browser.

---

## Core Modules

* **Interactive Visualizer Lab:** Real-time, interactive visual manipulation of data structures. Watch memory shift during array insertions, follow pointers in linked lists, trace recursive paths in Binary Search Trees, and map out BFS/DFS traversals on a customizable Graph canvas.
* **Integrated Java Compiler:** A live coding environment powered by the **Monaco Editor** (the same engine behind VS Code). The Spring Boot backend safely compiles (`javac`) and executes (`java`) user-submitted code in real-time, returning console output or compilation errors directly to the frontend.
* **Algorithmic Patterns & Theory:** Textbook-style documentation explaining the mechanics, time/space complexities, and implementation techniques for standard data structures and advanced interview patterns.
* **Practice Problem Database:** An integrated **H2 database** that stores curated LeetCode-style questions. Includes a built-in Admin UI to dynamically add new problems, categorize them by topic, and assign difficulty levels.
* **Dynamic Sandbox:** A free-play coding environment where users can write, compile, and execute arbitrary Java code outside the constraints of a specific problem.

---

## Supported Topics & Patterns

**Data Structures Covered:**
* Arrays & ArrayLists
* Singly Linked Lists
* Stacks (LIFO) & Queues (FIFO)
* Binary Search Trees (BST)
* Graphs (Directed, Undirected, Weighted)

**Algorithmic Patterns Covered:**
* Two Pointers & Sliding Window
* Prefix Sums
* Fast & Slow Pointers (Tortoise and Hare)
* Top-Down & Bottom-Up Tree Recursion
* Level-Order Traversal (BFS)
* Dijkstra's Shortest Path Algorithm
* Topological Sorting (Kahn's Algorithm)
* Cycle Detection (Union-Find / Disjoint Set)

---

## Tech Stack

**Backend**
* **Java (JDK 17+)**
* **Spring Boot 3.x**
* **Spring Web** (REST APIs & Controller Routing)
* **Spring Data JPA**
* **H2 In-Memory Database** (with automated initialization via `data.sql`)

**Frontend**
* **HTML5 & CSS3** (Custom responsive UI, CSS variables, CSS Grid/Flexbox)
* **Vanilla JavaScript** (DOM manipulation, HTML5 Canvas API for rendering trees and graphs)
* **Thymeleaf** (Server-side rendering and dynamic data binding)
* **Monaco Editor API** (Browser-based syntax highlighting and code formatting)

---

## Local Setup & Installation

Before running this project locally, ensure you have the **Java Development Kit (JDK) 17+** installed, and that both the `javac` and `java` commands are available in your system's PATH.

### 1. Clone the repository
```bash
git clone [https://github.com/Yuvrraaj/java-dsa-visualizer-.git](https://github.com/Yuvrraaj/java-dsa-visualizer-.git)
cd java-dsa-visualizer-
```

### 2. Build the project

mvn clean install

### 3. Run the application

mvn spring-boot:run

### 4. Access the application

Open your web browser and navigate to: http://localhost:8080

## Project Architecture

src/main/java/com/dsa/controller: Contains the REST controllers (CodeRunnerController for the compiler) and View controllers (TopicController, QuestionController) that manage the routing and Thymeleaf models.

src/main/java/com/dsa/model: Contains the JPA Entities representing the database schema (e.g., Question).

src/main/java/com/dsa/repository: Interfaces extending JpaRepository for database operations.

src/main/java/com/dsa/service: The business logic layer acting as the intermediary between the controllers and the database.

src/main/resources/templates: Contains all Thymeleaf HTML views (dashboards, theory pages, visualizers, and the code editor).

src/main/resources/static: Contains the global CSS stylesheets and static assets.

src/main/resources/data.sql: Automatically seeds the H2 database with starter practice questions whenever the server boots up.

## Security Disclaimer regarding the Live Compiler

The /api/code/run endpoint utilizes Java's ProcessBuilder to compile and execute code directly on the host environment. While this is acceptable for local development, personal learning, and containerized PaaS deployments (like the Render live demo, which runs in an isolated ephemeral container), running raw user code on a server carries inherent risks.

For enterprise-level public deployment, it is highly recommended to implement strict sandboxing, execution timeouts, and resource limitations (e.g., via Docker SDKs or isolated gVisor containers) to prevent arbitrary code execution (RCE) and infinite loop resource exhaustion.

## License

This project is open-source and available under the MIT License.
