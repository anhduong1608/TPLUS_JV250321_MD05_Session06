package com.example.employee.repository;

import com.example.employee.data.Data;
import com.example.employee.model.Employee;

import java.util.List;

public class EmployeeRepository {
    public List<Employee> getAll() {
        return Data.employees;
    }

    public void add(Employee e) {
        Data.employees.add(e);
    }
}
