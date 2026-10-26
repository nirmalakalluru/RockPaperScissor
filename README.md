Rock Paper Scissors Game 🎮
📌 Project Overview
This is a simple Rock Paper Scissors game developed in Java. The user plays against the computer, which randomly selects Rock, Paper, or Scissors. The program compares both choices and determines the winner.

This project demonstrates basic Java programming concepts, including user input, conditional statements, random number generation, and input validation.

🚀 Features
Allows the user to choose Rock, Paper, or Scissors.
Generates a random choice for the computer.
Validates user input to ensure it is within the allowed range.
Determines the winner based on the game rules.
Displays whether the user wins, the computer wins, or the game ends in a tie.
🛠️ Technologies Used
Programming Language: Java
Java Classes: Scanner, Random
Concepts: Conditional statements (if-else), user input, random number generation, and input validation.
🎯 Game Rules
The game uses the following choices:


Input	Choice
0	Rock
1	Paper
2	Scissors
The winner is determined by these rules:

Rock beats Scissors.
Paper beats Rock.
Scissors beats Paper.
If both players choose the same option, the game ends in a tie.
📋 Prerequisites
Before running the program, make sure you have:

Java Development Kit (JDK) installed.
A Java IDE, such as Eclipse or IntelliJ IDEA, or a terminal to compile and run the program.
▶️ How to Run
1. Clone the repository

bash
git clone <your-repository-url>
2. Navigate to the project directory
Open the project in your preferred Java IDE or navigate to the directory containing your source code.

3. Compile the program
If your file is located in the appropriate package directory, compile it from the directory containing Day4:


bash
javac Day4/RockPaperScissor.java
4. Run the game

bash
java Day4.RockPaperScissor
💻 Example Output

text
Welcome to the Rock Paper Scissor game
Enter your choice
0: Rock, 1: Paper, 2: Scissors
1
User choice is: 1
Computer Choice is: 0
Congrats you win!
Note: The computer's choice and the result may vary each time you run the game.

⚠️ Input Validation
The program accepts only the numbers 0, 1, and 2.

If the user enters a number outside this range, the program displays an invalid-choice message and exits.

📚 What I Learned
Through this project, I practiced:

Taking user input using the Scanner class.
Generating random numbers using the Random class.
Implementing game logic with if-else statements.
Validating user input.
Using logical operators to determine the winner.
Organizing Java code inside a package.
🔮 Future Improvements
Allow the user to play multiple rounds.
Display the choices as words instead of numbers.
Add a score tracker for the user and computer.
Handle non-numeric input gracefully.
Improve the game interface and user experience.
