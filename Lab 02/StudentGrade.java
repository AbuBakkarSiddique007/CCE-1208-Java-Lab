/*
 * Task No: 1
 * Task Name: Write a Java program that takes a student's exam marks as input and determines the grade
 */

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student's exam marks (0-100): ");
        int marks = input.nextInt();

        String grade;

        if (marks >= 80 && marks <= 100) {
            grade = "A+";
        } else if (marks >= 70) {
            grade = "A";
        } else if (marks >= 60) {
            grade = "A-";
        } else if (marks >= 50) {
            grade = "B";
        } else if (marks >= 40) {
            grade = "C";
        } else if (marks >= 33) {
            grade = "D";
        } else if (marks >= 0) {
            grade = "F";
        } else {
            grade = "Invalid marks!";
        }

        System.out.println("Grade: " + grade);

        input.close();

    }
}
