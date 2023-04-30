package com.ness1.demo2.controller;

import com.ness1.demo2.entity.Employee;
import com.ness1.demo2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/add")
    public Employee addData(@RequestBody Employee employee)
    {
        return employeeService.saveEmployee(employee);
    }
    @GetMapping("/getall")
    public List<Employee> fetchEmployeeList()
    {
        return employeeService.fetchEmployeeList();
    }
    @GetMapping("/getall/{id}")
    public Employee fetchEmployeeById(@PathVariable("id") Integer Id){
        return employeeService.fetchEmployeeById(Id);
    }
    @DeleteMapping("/getall/{id}")
    public String deleteEmployeeById(@PathVariable("id") Integer Id)
    {
        employeeService.deleteEmployeeById(Id);
        return "Department deleted Successfully";
    }
    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable Integer id,@RequestBody Employee employee)
    {
       return employeeService.updateEmployee(id,employee);
    }
}
