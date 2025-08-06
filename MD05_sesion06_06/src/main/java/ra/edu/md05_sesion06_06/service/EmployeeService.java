package com.example.employee.service;

import com.example.employee.model.Employee;
import com.example.employee.repository.EmployeeRepository;

import java.util.List;

public class EmployeeService {
    private final EmployeeRepository repo = new EmployeeRepository();

    public List<Employee> getAllEmployees() {
        return repo.getAll();
    }

    public void addEmployee(Employee e) {
        repo.add(e);
    }
}
