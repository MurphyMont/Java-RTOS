# Real-Time Operating System (RTOS) Simulation in Java

This project is a **Java-based simulation of a Real-Time Operating
System (RTOS)** that demonstrates process scheduling, execution, and
termination using a graphical user interface (GUI) built with Java
Swing.

------------------------------------------------------------------------

## 🧩 Features

-   **Priority-Based Scheduling:** Processes are sorted by priority
    before execution.
-   **Dynamic Process Management:** Add, execute, and terminate
    processes in real-time.
-   **Automatic Runtime Updates:** Each process displays an updated
    runtime while active.
-   **Interactive GUI:** Buttons for adding processes, dispatching them
    to the CPU, and ending them manually.
-   **Process History Table:** Tracks completed or terminated processes
    automatically.
-   **Encapsulated OOP Design:** Separate classes for scheduling logic
    and GUI handling.

------------------------------------------------------------------------

## 🖼️ Screenshots

All screenshots are stored in the `screenshots` folder.

Example screenshots include: - Process addition and queue display\
- CPU runtime update\
- Completed/terminated process log

------------------------------------------------------------------------

## 🧠 Technical Overview

### Programming Language

-   **Java (JDK 17 or later)**

### Frameworks & Libraries

-   **Swing** for GUI design\
-   **javax.swing.Timer** for real-time updates

### Core Classes

-   `Os` -- Handles GUI components and user interaction\
-   `Priority` -- Implements process scheduling logic\
-   `Process` -- Represents an individual process with priority and
    runtime attributes

------------------------------------------------------------------------

## 🚀 How to Run

1.  Clone this repository:

    ``` bash
    git clone https://github.com/yourusername/rtos-simulation.git
    ```

2.  Open the project in **IntelliJ IDEA**, **Eclipse**, or your
    preferred IDE.

3.  Compile and run the `Os.java` file.

4.  Add processes through the interface and start simulations.

------------------------------------------------------------------------

## 📁 Folder Structure

    RTOS-Simulation/
    │
    ├── src/
    │   └── Os.java
    │
    ├── screenshots/
    │   ├── Screenshot_1.png
    │   ├── Screenshot_2.png
    │   └── Screenshot_3.png
    │
    └── README.md

------------------------------------------------------------------------

## 💡 Future Improvements

-   Implement **preemptive scheduling** using Java threads.\
-   Add a **CPU utilization progress bar**.\
-   Export process logs to `.csv` for persistence.\
-   Refactor GUI layout for better scalability.

------------------------------------------------------------------------

## 👨‍💻 Author

**Murphy Kwame Frimpong**\
Master's Student in Computer Science and Software Engineering\
Constructor University, Bremen, Germany\
📧 frimpongkwamemurphy1@gmail.com

------------------------------------------------------------------------

## 🏁 License

This project is licensed under the MIT License -- see the
[LICENSE](LICENSE) file for details.
