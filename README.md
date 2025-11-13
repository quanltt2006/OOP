Arkanoid Game - Object-Oriented Programming Project
Author
Group [Số nhóm] - Class [Mã lớp]

[Họ tên 1] - [MSSV 1]
[Họ tên 2] - [MSSV 2]
[Họ tên 3] - [MSSV 3]
[Họ tên 4] - [MSSV 4]
Instructor: [Tên giảng viên]
Semester: [HK1/HK2 - Năm học]

Description
This is a classic Arkanoid game developed in Java as a final project for Object-Oriented Programming course. The project demonstrates the implementation of OOP principles and design patterns.

Key features:

The game is developed using Java 17+ with JavaFX/Swing for GUI.
Implements core OOP principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.
Applies multiple design patterns: Singleton, Factory Method, Strategy, Observer, and State.
Features multithreading for smooth gameplay and responsive UI.
Includes sound effects, animations, and power-up systems.
Supports save/load game functionality and leaderboard system.
Game mechanics:

Control a paddle to bounce a ball and destroy bricks
Collect power-ups for special abilities
Progress through multiple levels with increasing difficulty
Score points and compete on the leaderboard
UML Diagram
Class Diagram
Class Diagram

Có thể sử dụng IntelliJ để generate ra Class Diagrams: https://www.youtube.com/watch?v=yCkTqNxZkbY

Complete UML diagrams are available in the docs/uml/ folder

Design Patterns Implementation
Có dùng hay không và dùng ở đâu

1. Singleton Pattern
Used in: GameManager, AudioManager, ResourceLoader

Purpose: Ensure only one instance exists throughout the application.

Multithreading Implementation
Có dùng hay không và dùng như thế nào

The game uses multiple threads to ensure smooth performance:

Game Loop Thread: Updates game logic at 60 FPS
Rendering Thread: Handles graphics rendering (EDT for JavaFX Application Thread)
Audio Thread Pool: Plays sound effects asynchronously
I/O Thread: Handles save/load operations without blocking UI
Installation
Clone the project from the repository.
Open the project in the IDE.
Run the project.
Usage
Controls
Key	Action
← or A	Move paddle left
→ or D	Move paddle right
SPACE	Launch ball / Shoot laser
P or ESC	Pause game
R	Restart game
Q	Quit to menu
How to Play
Start the game: Click "New Game" from the main menu.
Control the paddle: Use arrow keys or A/D to move left and right.
Launch the ball: Press SPACE to launch the ball from the paddle.
Destroy bricks: Bounce the ball to hit and destroy bricks.
Collect power-ups: Catch falling power-ups for special abilities.
Avoid losing the ball: Keep the ball from falling below the paddle.
Complete the level: Destroy all destructible bricks to advance.
Power-ups
Icon	Name	Effect
🟦	Expand Paddle	Increases paddle width for 10 seconds
🟥	Shrink Paddle	Decreases paddle width for 10 seconds
⚡	Fast Ball	Increases ball speed by 30%
🐌	Slow Ball	Decreases ball speed by 30%
🎯	Multi Ball	Spawns 2 additional balls
🔫	Laser Gun	Shoot lasers to destroy bricks for 15 seconds
🧲	Magnet	Ball sticks to paddle, launch with SPACE
🛡️	Shield	Protects from losing one life
🔥	Fire Ball	Ball passes through bricks for 12 seconds
Scoring System
Normal Brick: 100 points
Strong Brick: 300 points
Explosive Brick: 500 points + nearby bricks
Power-up Collection: 50 points
Combo Multiplier: x2, x3, x4... for consecutive hits
Demo
Screenshots
Main Menu
Main Menu

Gameplay
Gameplay

Power-ups in Action
Power-ups

Leaderboard
Leaderboard

Video Demo
Video Demo

Full gameplay video is available in docs/demo/gameplay.mp4

Future Improvements
Planned Features
Additional game modes

Time attack mode
Survival mode with endless levels
Co-op multiplayer mode
Enhanced gameplay

Boss battles at end of worlds
More power-up varieties (freeze time, shield wall, etc.)
Achievements system
Technical improvements

Migrate to LibGDX or JavaFX for better graphics
Add particle effects and advanced animations
Implement AI opponent mode
Add online leaderboard with database backend
Technologies Used
Technology	Version	Purpose
Java	17+	Core language
JavaFX	19.0.2	GUI framework
Maven	3.9+	Build tool
Jackson	2.15.0	JSON processing
License
This project is developed for educational purposes only.

Academic Integrity: This code is provided as a reference. Please follow your institution's academic integrity policies.

Notes
The game was developed as part of the Object-Oriented Programming with Java course curriculum.
All code is written by group members with guidance from the instructor.
Some assets (images, sounds) may be used for educational purposes under fair use.
The project demonstrates practical application of OOP concepts and design patterns.
