package com.ness1.demo2.service;

import com.ness1.demo2.entity.Employee;
import com.ness1.demo2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    @Autowired
    private  EmployeeRepository employeeRepository;
       @Override
       public Employee saveEmployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    public List<Employee> fetchEmployeeList(){
           return employeeRepository.findAll();
    }
    public Employee fetchEmployeeById(Integer id){
           return employeeRepository.findById(id).get();
    }
    public void deleteEmployeeById(Integer id){
            employeeRepository.deleteById(id);

    }
    public Employee updateEmployee(Integer id, Employee employee){
           Employee emp=employeeRepository.findById(id).get();
           if(Objects.nonNull(employee.getName())&&
           !"".equalsIgnoreCase(employee.getName()))
        {
            emp.setName(employee.getName());
        }
           return employeeRepository.save(emp);
    }
}
