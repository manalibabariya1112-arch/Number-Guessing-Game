# Number-Guessing-Game
A console-based Number Guessing Game built in Java. Features random number generation, input validation, scoring tracking, and user control flow logic.

# Java Number Guessing Game

A lightweight, console-based **Number Guessing Game** built in Java. This project demonstrates core programming fundamentals including conditional logic, loops, input validation, and random number generation.

## 🚀 Features
* **Dynamic Generation:** Uses `java.util.Random` to generate a secret number between 1 and 100.
* **Input Validation:** Prevents crashes by rejecting non-integer inputs (like strings or characters) and filtering out numbers out of range.
* **Score Tracking:** Counts and displays the total number of attempts it took to guess the correct number.
* **Interactive Feedback:** Provides real-time "Too high!" or "Too low!" hints inside a controlled `while` loop.

## 🛠️ Concepts Covered
* Variables & Data Types
* Object Instantiation (`Scanner`, `Random`)
* Control Flow (`while` loop, `if-else` ladders)
* Input Buffer Cleaning

## How to Run

1. **Clone the repository:**
   ```bash
   git clone <your-repository-url>
   cd <repository-folder-name>
   ```

2. **Compile the Java source file:**
   ```bash
   javac NumberGuessingGame.java
   ```

3. **Run the application:**
   ```bash
   java NumberGuessingGame
   ```
