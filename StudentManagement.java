// Student class
public class Student {
    private String name;
    private int rollNumber;
    private double marks;

    // Constructor, getters, and setters for name, rollNumber, and marks
    // ...
}

// StudentManagementSystem class
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {
    private ArrayList<Student> students = new ArrayList<>();

    // Method to add a new student to the system
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display details of all students
    public void viewAllStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollNumber() + ", Marks: " + student.getMarks());
        }
    }

    // Method to search for a student by roll number
    public Student searchStudentByRollNumber(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    // Method to calculate and display the average marks of all students
    public void calculateAndDisplayAverageMarks() {
        double totalMarks = 0.0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        double averageMarks = totalMarks / students.size();
        System.out.println("Average Marks: " + averageMarks);
    }
}

// Main class to run the program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem managementSystem = new StudentManagementSystem();

        // Sample usage:
        // You can take input from the user to add students and perform other operations
        // For simplicity, let's add a couple of sample students here
        Student student1 = new Student("John Doe", 101, 85.5);
        Student student2 = new Student("Jane Smith", 102, 78.0);
        managementSystem.addStudent(student1);
        managementSystem.addStudent(student2);

        managementSystem.viewAllStudents();

        int searchRollNumber = 101;
        Student searchedStudent = managementSystem.searchStudentByRollNumber(searchRollNumber);
        if (searchedStudent != null) {
            System.out.println("Found Student: " + searchedStudent.getName() + ", Roll Number: " + searchedStudent.getRollNumber() + ", Marks: " + searchedStudent.getMarks());
        } else {
            System.out.println("Student with Roll Number " + searchRollNumber + " not found.");
        }

        managementSystem.calculateAndDisplayAverageMarks();

        scanner.close();
    }
}