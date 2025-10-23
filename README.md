# 🤖 Java Code Companion

An AI-powered command-line assistant, built with Java and the Deep Java Library (DJL), designed to help B.Tech students learn Java programming more effectively.

## 🌟 Introduction

This project was created by **Rohith Das T**, **Pavan Nitin**, and **Viswajith V A** for our B.Tech Software Engineering course. We noticed that many students (including ourselves!) struggle with complex Java concepts, cryptic error messages, and writing boilerplate code. Our goal is to provide a smart, specialized tool that offers instant help right from the terminal.

## ✨ Core Features

* **🧠 Concept Explainer:** Ask for an explanation of any core Java topic (e.g., "Explain polymorphism") and get a simple, student-friendly answer.
* **💻 Code Snippet Generator:** Request boilerplate code for common tasks (e.g., "Write a for-each loop in Java") to speed up your coding.
* **🐞 Error Explainer:** Paste a common Java error (like `NullPointerException`) and get a clear explanation of what it means and how to fix it.

## 🛠️ Technology Stack

* **Programming Language:** Java
* **AI/ML Framework:** [Deep Java Library (DJL)](https://djl.ai/)
* **Base Model:** A pre-trained Small Language Model (like `DistilGPT-2`) from the Hugging Face Hub, fine-tuned on our custom dataset.
* **Build Tool:** Maven
* **Version Control:** Git & GitHub

## 🚀 Getting Started

### Prerequisites

* Java Development Kit (JDK) 8 or higher
* Apache Maven

### Installation & Running

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/YourUsername/java-code-companion.git](https://github.com/YourUsername/java-code-companion.git)
    cd java-code-companion
    ```

2.  **Build the project with Maven:**
    (The first build will take some time as it needs to download the AI model and dependencies).
    ```bash
    mvn clean package
    ```

3.  **Run the application:**
    ```bash
    java -jar target/java-code-companion-1.0.jar
    ```

## 👥 Meet the Team

* **Rohith Das T** - Data Engineer
* **Pavan Nitin** - ML Engineer
* **Viswajith V A** - Software Engineer

---
