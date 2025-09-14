# Motion Mind

**Motion Mind** is an interactive educational platform that makes STEM learning more accessible, engaging, and fun.  
Built during the CSU East Bay Hackathon, Motion Mind AR combines **gesture recognition**, **physics simulation**, and **AR-inspired gameplay** to teach learners of all ages STEM concepts through hands-on exploration.  

> Use your hands to construct objects and advance through levels

---

## Project Overview
Traditional online learning often struggles with engagement, especially in STEM subjects.  
**Motion Mind** bridges this gap by blending:
- **Gesture-based interaction** → players build and manipulate virtual objects using hand motions.
- **Physics-based gameplay** → solving puzzles requires applying real-world STEM concepts in-game such as force, friction, and gravity.
- **Course progression** → structured levels ensure a gradual, rewarding learning experience (Planned)

**Goal:**
> To inspire curiosity and kinesthetic learning in STEM through immersive, interactive technology.

---

## Tech Stack
This project spans multiple technologies, each responsible for a key part of the pipeline:

### Frontend
- **Next.js** – Hosts the web interface. (planned: integrates Unity WebGL build)
- **React** – Responsive UI for authentication and course progression.
- **TailwindCSS** – Rapid styling and prototyping.

### Backend
- **Spring Boot** – Manages user state, login, verification, authentication, course progression, and serves API for Unity.
- **WebSockets (STOMP and SockJS)** – Real-time communication between services and clients.
- **Supabase** – Stores authentication and persistent user progress information

### Machine Learning
- **Flask** – serves the machine learning model API for gesture recognition.
- **MediaPipe / OpenCV** – Used to capture and classify static hand gestures.
- **Custom lightweight CNN** – Predicts gesture categories (e.g. ladder, cube, ramp).

### Game Engine
- **Unity (planned: WebGL Export)** – Physics-driven game environment embedded in the Next.js app.
- Players use gestures to spawn Unity primitives (cube, ladder, ramp, etc.) and interact with them through natural physics.

---

## 📂 Repository Structure
```plaintext
.
├── mm-frontend/        # Next.js frontend
├── mm-backend/         # Spring Boot backend
├── mm-flask/          # Flask setup which includes ML API
└── README.md
