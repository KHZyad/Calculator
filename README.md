# Calculator

Console-Based Calculator in Java
This project is a console-based calculator developed in Java, following Object-Oriented Programming (OOP) principles. It supports four basic arithmetic operations (+, -, /, *) and can be run from the command line.


Design and Structure
This software strictly adheres to OOP principles and consists of:

Abstract Class Calculator: Defines the abstract method double compute(double A, double B) that each operation class implements.
Operator Classes: Each operator (+, -, /, *) has its own class, inheriting from the Calculator class, and provides its own implementation of the compute method.
Class Design:
Calculator (Abstract class)
Abstract method: double compute(double A, double B)
Addition, Subtraction, Multiplication, Division (Concrete classes)
Each implements the compute method for the respective operation.
