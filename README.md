# Customized Database Management System

A customized in-memory Database Management System developed in Java using Object-Oriented Programming and the Collections Framework. The project simulates core DBMS functionalities without using any external database such as MySQL or Oracle.

---

## Overview

This project is designed to demonstrate the internal working of a Database Management System by implementing SQL-like operations using Java and LinkedList data structures.

Employee records are stored dynamically in memory, and users can perform various database operations through a menu-driven command-line interface.

---

## Features

### CRUD Operations
- Insert Employee Records
- Display All Records
- Search Employee by ID
- Search Employee by Name
- Update Employee Information
- Delete Employee Records

### Aggregate Functions
- Count Records
- Sum of Salaries
- Average Salary
- Maximum Salary
- Minimum Salary

### Additional Features
- Automatic Employee ID Generation
- Menu Driven Interface
- Dynamic Data Storage using LinkedList
- SQL-like Database Operations

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Collections Framework
- LinkedList
- Command Line Interface (CLI)

---

## Project Architecture

```text
User
 │
 ▼
Menu Driven Interface
 │
 ▼
MarvellousDBMS
 │
 ▼
LinkedList<Employee>
 │
 ▼
Employee Records
```

---

## Class Structure

### Employee Class

Stores employee details:

- Employee ID
- Employee Name
- Employee Age
- Employee Address
- Employee Salary

### MarvellousDBMS Class

Implements database operations:

- Insert
- Select
- Update
- Delete
- Aggregate Functions

---

## Supported Operations

| Operation | Description |
|------------|------------|
| Insert | Add new employee |
| Select All | Display all employees |
| Select by ID | Search employee using ID |
| Select by Name | Search employee using name |
| Update | Update employee information |
| Delete | Remove employee record |
| Count | Count total records |
| Sum | Total salary calculation |
| Average | Average salary calculation |
| Maximum | Highest salary |
| Minimum | Lowest salary |

---

## Sample Menu

```text
1. Insert Record
2. Display All Records
3. Display Record By ID
4. Display Record By Name
5. Delete Record
6. Count Records
7. Sum Salaries
8. Average Salary
9. Maximum Salary
10. Minimum Salary
11. Update Record
12. Delete Database
13. Exit
```

---

## Sample Output

```text
Welcome to Marvellous DBMS

Enter Employee Name : John
Enter Age : 25
Enter Salary : 50000
Enter Address : Pune

Record inserted successfully.
```

---

## Learning Outcomes

- Database Management System Concepts
- Object-Oriented Programming
- Java Collections Framework
- LinkedList Data Structure
- CRUD Operations
- Aggregate Function Implementation
- Algorithm Design

---

## Future Enhancements

- File Storage Support
- MySQL Integration
- GUI using JavaFX/Swing
- User Authentication
- SQL Query Parser
- Report Generation

---

## Author

**Shabdshree Lohar**

B.Tech Computer Science Engineering

Sanjay Ghodawat University

GitHub: https://github.com/ShabdshreeLohar21
