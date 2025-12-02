package lassignment1;

import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String course;
    double marks;
    char grade;

    // Default constructor
    Student() {}

    // Parameterized constructor
    Student(int rollNo, String name, String course, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
        this.marks = marks;
        calculateGrade();
    }

    // Method to take user input
    void inputDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollNo = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Course: ");
        course = sc.nextLine();

        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();

        calculateGrade();
    }

    // Grade calculation
    void calculateGrade() {
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else grade = 'D';
    }

    // Display method
    void displayDetails() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Course  : " + course);
        System.out.println("Marks   : " + marks);
        System.out.println("Grade   : " + grade);
        System.out.println("----------------------------------");
    }
}