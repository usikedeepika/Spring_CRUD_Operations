package com.ness1.demo2.service;

import com.ness1.demo2.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> fetchEmployeeList();

   public Employee fetchEmployeeById(Integer id);

   public void deleteEmployeeById(Integer id);

    Employee updateEmployee(Integer id, Employee employee);
}
