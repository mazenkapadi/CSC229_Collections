package org.example;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Employee {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(Employee other) {
        this.id = other.id;
        this.name = other.name;
    }

    public Employee deepCopy() {
        return new Employee(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Employee " +
                "id=" + id +
                ", name='" + name + '\'';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (id != employee.id) return false;
        return Objects.equals(name, employee.name);
    }

    public static void showAll(List<Employee> list) {
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }

    public static void showAllUsingIterator(List<Employee> list) {
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }
}
