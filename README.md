# Guess the Number Game 🎲

A simple and interactive Java-based game where the player tries to guess a randomly selected number within a limited number of attempts. The game provides hints and calculates the score based on performance. 

## How to Play
1. The program generates a random number between 1 and 100.
2. The player has 5 attempts to guess the number.
3. After each guess, the game provides feedback:
   - **"Very close!"**: Your guess is within 2 of the target number.
   - **"Close!"**: Your guess is within 5 of the target number.
   - **"Too low!"**: Your guess is smaller than the target number.
   - **"Too high!"**: Your guess is larger than the target number.
4. If you guess correctly, you earn points based on your remaining attempts.
5. You can choose to play multiple rounds, and your score accumulates over the session.

## Features
- **Dynamic Range**: Random number generation within the range of 1 to 100.
- **Hints**: Feedback to guide the player.
- **Score System**: Points are awarded based on the remaining attempts.
- **Replay Option**: Players can replay the game and keep track of their cumulative score.

## Prerequisites
To run this program, ensure you have the following installed:
- Java Development Kit (JDK) 8 or higher.
- A text editor or IDE like VS Code, IntelliJ IDEA, or Eclipse.

## Installation
1. Clone the repository:
                  git clone https://github.com/Nancy2668
   /guess-the-number-game.git
                  cd guess-the-number-game
3. COMPILE THE PROGRAM
                    javac GuessTheNumber.java
4. RUN THE PROGRAM
                  java GuessTheNumber
