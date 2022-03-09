package com.example.demoboot.EmployeeService;

import com.example.demoboot.model.Employee;

import java.util.List;

public interface EmployeeSer  {
    void addEmployee(Employee employee);
    void deleteEmployee(int id);
    void editEmployee(Employee employee);
    Employee getEmployeeById(int id);
    List<Employee> getAllEmployees();
}
