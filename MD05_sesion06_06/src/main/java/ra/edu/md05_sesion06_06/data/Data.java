package com.example.employee.data;

import com.example.employee.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Employee> employees = new ArrayList<>();

    static {
        employees.add(new Employee("Alice", "alice@example.com", "Manager"));
        employees.add(new Employee("Bob", "bob@example.com", "Developer"));
        employees.add(new Employee("Charlie", "charlie@example.com", "Designer"));
        employees.add(new Employee("David", "david@example.com", "Tester"));
        employees.add(new Employee("Emma", "emma@example.com", "Support"));
        // thêm đủ để phân trang
    }
}
