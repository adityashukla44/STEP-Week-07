# STEP Week 07: Encapsulation

My solutions to the Week 7 practice problems and coding assignment of the **STEP Java Programming** track.

## Topics covered

- Private fields with controlled access
- Validation inside setters and methods
- Immutable classes and `final` fields
- Defensive copies
- Read-only and write-only APIs

## Practice

| Program | What it does | Input |
|---------|--------------|-------|
| [`AttendanceSheet`](Practice/AttendanceSheet.java) | Marks attendance through methods while keeping the record private | Built-in example |
| [`Locker`](Practice/Locker.java) | A write-only locker code that can only be changed by entering the current code | Built-in example |
| [`NameTag`](Practice/NameTag.java) | An immutable name tag class | Built-in example |
| [`PiggyBank`](Practice/PiggyBank.java) | Handles deposits and withdrawals and rejects overdrawing | Built-in example |
| [`Scorecard`](Practice/Scorecard.java) | Records answers for a fixed number of questions and computes the score | Built-in example |

## Assignment

| Program | What it does | Input |
|---------|--------------|-------|
| [`Cart`](Assignment/Cart.java) | A shopping cart that computes its total and item count on request | Built-in example |
| [`CharacterHealthBar`](Assignment/CharacterHealthBar.java) | Keeps a character's health between 0 and its maximum | Built-in example |
| [`PasswordChecker`](Assignment/PasswordChecker.java) | Rates password strength without exposing the password | Built-in example |
| [`Playlist`](Assignment/Playlist.java) | Returns defensive copies so the internal song list can't be changed from outside | Built-in example |
| [`TrafficLight`](Assignment/TrafficLight.java) | Cycles through red, green and yellow using controlled state changes | Built-in example |

## Project structure

```
.
├── Practice/
│   ├── AttendanceSheet.java
│   ├── Locker.java
│   ├── NameTag.java
│   ├── PiggyBank.java
│   ├── Scorecard.java
│   └── README.md
├── Assignment/
│   ├── Cart.java
│   ├── CharacterHealthBar.java
│   ├── PasswordChecker.java
│   ├── Playlist.java
│   ├── TrafficLight.java
│   └── README.md
└── README.md
```

## How to run

You need JDK 17 or later.

```bash
cd Practice      # or: cd Assignment
javac FileName.java
java FileName
```

Replace `FileName` with the program name. Programs marked **Interactive** read input from the terminal; the rest run a built-in example straight away. Each file is self-contained, so you can also open it in VS Code or IntelliJ and press **Run**.

## All STEP weeks

| Week | Topic |
|------|-------|
| [Week 1](https://github.com/adityashukla44/STEP-Week-01) | Java Basics: Strings, Loops and Arrays |
| [Week 2](https://github.com/adityashukla44/STEP-Week-02) | String Processing and Validation |
| [Week 3](https://github.com/adityashukla44/STEP-Week-03) | Classes, Objects and Constructors |
| [Week 4](https://github.com/adityashukla44/STEP-Week-04) | Array Algorithms |
| [Week 5](https://github.com/adityashukla44/STEP-Week-05) | Arrays and Methods |
| [Week 6](https://github.com/adityashukla44/STEP-Week-06) | Object-Oriented Programming Revision |
| **Week 7** | **Encapsulation** (this repo) |
| [Week 8](https://github.com/adityashukla44/STEP-Week-08) | Inheritance and Polymorphism |
| [Week 9](https://github.com/adityashukla44/STEP-Week-09) | Abstraction and Interfaces |
| [Week 10](https://github.com/adityashukla44/STEP-Week-10) | Coding Practice Set |

## Author

**Aditya Shukla** · [@adityashukla44](https://github.com/adityashukla44)
