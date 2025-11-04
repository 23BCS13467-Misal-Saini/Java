// Question 1: Java Collection Framework
// Write a Java program that uses an ArrayList to store a list of student names.
// Implement a method to add a name, remove a name. Handle the
// case where the list is empty using a custom exception.

import java.util.*;

class EmptyListException extends Exception {
    public EmptyListException(String message) {
        super(message);
    }
}
public class StudentList {
    private ArrayList<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
        System.out.println(name + " added to the list.");
    }

    public void removeStudent(String name) throws EmptyListException {
        if (students.isEmpty()) {
            throw new EmptyListException("Cannot remove from empty list!");
        }
        if (students.remove(name)) {
            System.out.println(name + " removed from the list.");
        } else {
            System.out.println(name + " not found in the list.");
        }
    }

    public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the list.");
        } else {
            System.out.println("Student List: " + students);
        }
    }

    public static void main(String[] args) {
        StudentList sl = new StudentList();
        sl.addStudent("Amit");
        sl.addStudent("Ravi");
        sl.displayStudents();

        try {
            sl.removeStudent("Ravi");
            sl.displayStudents();
            sl.removeStudent("Ravi"); 
            sl.removeStudent("Amit");
            sl.removeStudent("AnyName"); 
            sl.removeStudent("X");       
        } catch (EmptyListException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
