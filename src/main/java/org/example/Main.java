package org.example;

import java.util.ArrayList;
import java.util.LinkedList;
import static org.example.Employee.showAll;
import static org.example.Employee.showAllUsingIterator;

public class Main {
    public static void main(String[] args) {
        // Create an instance of an ArrayList of Employee.
        // Add 3 employees to the ArrayList.
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John"));
        employees.add(new Employee(2, "Jane"));
        employees.add(new Employee(3, "Jack"));

        // Call the showAll method and pass the ArrayList as a parameter.
        showAll(employees);

        LinkedList<Employee> employees2 = new LinkedList<>();
        employees2.add(new Employee(1, "Jake"));
        employees2.add(new Employee(2, "Jill"));
        employees2.add(new Employee(3, "Jen"));

        showAll(employees2);

        // Test showAllUsingIterator for ArrayList
        showAllUsingIterator(employees);

        // Test showAllUsingIterator for LinkedList
        showAllUsingIterator(employees2);
    }
}
