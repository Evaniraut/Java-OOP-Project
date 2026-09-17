# Java OOP – Educational Staff Management System

A Java-based Object-Oriented Programming project that models different staff roles within an educational institution.

The project uses `Teacher` as a base class with `Lecturer` and `Tutor` as specialized subclasses, demonstrating core OOP concepts including inheritance, encapsulation, method overriding, constructors, accessor methods, and mutator methods.

## Project Overview

The system consists of three main Java classes:

- **Teacher** – Stores general teacher information including ID, name, address, employment status, working type, and working hours.
- **Lecturer** – Extends the Teacher class and includes department information, years of experience, assignment grading, and grading status.
- **Tutor** – Extends the Teacher class and manages specialization, academic qualifications, performance index, certification status, and salary appraisal.

## OOP Concepts Demonstrated

- Inheritance
- Encapsulation
- Method Overriding
- Constructors
- Accessor and Mutator Methods
- Conditional Logic
- Object Creation and Interaction

## Class Structure

### Teacher

The base class containing common attributes and functionality for educational staff.

Key functionality:

- Store teacher information
- Set working hours
- Retrieve teacher attributes
- Display teacher details

### Lecturer

A subclass of `Teacher` that adds functionality related to lecturers.

Key functionality:

- Store department and experience information
- Grade assignments based on defined conditions
- Track whether grading has been completed
- Display lecturer-specific information

### Tutor

A subclass of `Teacher` containing tutor-specific functionality.

Key functionality:

- Store specialization and academic qualifications
- Track performance index
- Calculate salary appraisal based on performance
- Manage certification status
- Remove/reset tutor information when applicable

## Class Hierarchy

```text
                Teacher
               /       \
          Lecturer     Tutor
