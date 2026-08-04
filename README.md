# 🎯 Number Guessing Game (Java)

A simple console-based **Number Guessing Game** developed in **Java**. The game generates a random number between **1 and 100**, and the player has **7 attempts** to guess it correctly. The project includes score calculation, multiple rounds, replay functionality, and robust input validation.

## 📌 Features

- 🎲 Random number generation (1–100)
- 🔢 Maximum of 7 attempts per round
- 📈 Score calculation based on remaining attempts
- 🔄 Play multiple rounds
- 🏆 Final score and rounds summary
- ✅ Input validation using exception handling
- 💻 Console-based user interface

---

## 🛠️ Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Java Random Class
- Java Scanner Class
- Exception Handling (`InputMismatchException`)

---

## 📂 Project Structure

```
NumberGame_Java_P1.java
```

---

## 🚀 How to Run

### Prerequisites

- Java JDK 8 or above
- Any Java IDE (IntelliJ IDEA, Eclipse, VS Code) or Command Prompt

### Compile

```bash
javac NumberGame_Java_P1.java
```

### Run

```bash
java NumberGame_Java_P1
```

---

## 🎮 Gameplay

1. The program generates a random number between **1 and 100**.
2. The player gets **7 chances** to guess the correct number.
3. After every guess:
   - Too High
   - Too Low
   - Correct Guess
4. If the player guesses correctly:
   - Points are awarded based on remaining attempts.
5. The player can choose to play another round.
6. At the end, the total score and rounds played are displayed.

---

## 🧮 Scoring System

| Attempts Used | Score |
|--------------|------:|
| 1 | 70 |
| 2 | 60 |
| 3 | 50 |
| 4 | 40 |
| 5 | 30 |
| 6 | 20 |
| 7 | 10 |
| Failed | 0 |

---

## 📷 Sample Output

```
=================================
  WELCOME TO THE NUMBER GAME
  DecodeLabs Java Training - P1
=================================

--- Round 1 ---
I'm thinking of a number between 1 and 100.
You have 7 attempts. Good luck!

Attempt 1 - Enter your guess (1-100): 50
Too Low! Attempts remaining: 6

Attempt 2 - Enter your guess (1-100): 75
Too High! Attempts remaining: 5

Attempt 3 - Enter your guess (1-100): 68
Correct! The number was 68.
You scored 50 points this round.

Play Again? [Y/N]:
```

---

## 📚 Concepts Demonstrated

- Random Number Generation
- Loops (`while`)
- Methods
- Conditional Statements
- Exception Handling
- User Input Validation
- Score Calculation
- Modular Programming

---

## 🔮 Future Enhancements

- Difficulty Levels (Easy, Medium, Hard)
- Timer-Based Gameplay
- High Score Tracking
- Leaderboard
- Graphical User Interface (Java Swing/JavaFX)
- Save Scores to File or Database

---

## 👨‍💻 Author

**Gandla Karthik**

- GitHub: https://github.com/your-username

---

## 📄 License

This project is intended for learning and educational purposes.
