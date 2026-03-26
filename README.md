🕹️ The Third Eye – Unified Esports Ecosystem...\

A full-stack esports tournament management platform for BGMI using Kotlin, Jetpack Compose, Firebase & REST APIs.

📌 Project Overview

The Third Eye: Unified Esports Ecosystem is a centralized digital platform designed to manage and streamline esports tournaments, primarily focused on BGMI (Battlegrounds Mobile India).

The system provides a transparent, secure, and scalable solution for gamers, organizers, and administrators to manage tournaments, matches, results, and player statistics efficiently.

This project is developed as a modern Android application using Kotlin, Jetpack Compose, XML layouts, and Firebase backend services.

🎯 Objectives

Centralized esports tournament management system

Simplify tournament hosting and participation

Automate match scheduling and result handling

Provide transparency and fair competition

Track player performance and match history

🧑‍💻 User Roles
🎮 Gamer

Register & login

Create and manage profile

Join tournaments

Create and manage squads

View room ID & password

Match history and performance tracking

Receive notifications

🏆 Organizer

Create & manage tournaments

Slot allocation

Match scheduling

Submit results

Prize pool management

Handle disputes

Revenue tracking

🛡️ Admin

Verify users and organizers

Approve tournaments

Fraud prevention

Platform analytics

System monitoring

⚙️ Core Features
🔐 Authentication & Security

Firebase Authentication

Role-based access control

Secure session handling

Encrypted data storage

🎮 Gamer Module

Profile management

Team & squad creation

Tournament registration

Match history

Performance statistics

Real-time notifications

🏆 Organizer Module

Tournament creation

Slot management

Match scheduling

Automated result submission

Complaint handling

Revenue dashboard

🛡️ Admin Module

User management

Tournament approval

Fraud detection

Platform analytics

🏁 Tournament Management

Tournament discovery

Match scheduling automation

Real-time status updates

Transparent result publishing

🧱 Tech Stack
📱 Android (Frontend)

Kotlin

Jetpack Compose

XML Layouts

MVVM Architecture

Coroutines & Flow

🔥 Backend & Services

Firebase Authentication

Firebase Firestore (Database)

Firebase Cloud Functions (APIs)

Firebase Storage

🌐 APIs

RESTful APIs

JSON-based communication

🛠 Tools

Git & GitHub

Android Studio

Postman

Firebase Console

🗃 Database Structure

Firestore Collections:

users

gamers

organizers

tournaments

teams

matches

match_results

complaints

payments

notifications

🏗 Architecture
MVVM Architecture

UI (Jetpack Compose / XML)
        ↓
ViewModel
        ↓
Repository
        ↓
Firebase + REST APIs


Clean Architecture principles

Scalable and maintainable codebase

Modular design

📱 Application Modules
- Authentication Module
- Gamer Dashboard
- Organizer Panel
- Admin Control Panel
- Tournament Management
- Notification System

🔐 Security Implementation

Firebase Authentication

Role-based access control

Firestore security rules

Secure API endpoints

Session management

📊 Non-Functional Requirements
Requirement	Description
Performance	Response time ≤ 2 seconds
Security	Protection from unauthorized access
Scalability	Supports future multi-game expansion
Usability	Simple & clean UI
Reliability	High uptime during tournaments
UI	Fully responsive layout
🚀 Future Enhancements

Live match streaming

AI-based cheating detection

Multi-game tournament support

In-app wallet & payment gateway

Ranking-based matchmaking

Sponsor & advertisement modules

🛠 Setup Instructions
1️⃣ Clone Repository
git clone https://github.com/Sonu-kumar-singh-28/the-third-eye.git

2️⃣ Open in Android Studio
3️⃣ Setup Firebase

Create Firebase Project

Enable Authentication

Setup Firestore Database

Add google-services.json

4️⃣ Build & Run
📸 Screenshots

(Add app screenshots here)

🤝 Contribution

Pull requests are welcome.
For major changes, please open an issue first to discuss what you want to change.

📜 License

This project is licensed under the MIT License.

👨‍💻 Developed By

Sonu
Android Developer | Kotlin | Jetpack Compose | Firebase
