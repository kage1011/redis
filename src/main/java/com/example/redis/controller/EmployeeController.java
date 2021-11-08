package com.example.redis.controller;


import com.example.redis.model.Employee;
import com.example.redis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeRepository.saveEmployee(employee);
        return employee;
    }

    @GetMapping("/employees")
    public List<Employee> findAll(){

        return employeeRepository.findAll();
    }
    @GetMapping("/employees/{id}")
    public Employee findById(@PathVariable("id") Integer id){

        return employeeRepository.findById(id);
    }

    @PutMapping("/employee}")
    public void update(@RequestBody Employee employee){

        employeeRepository.update(employee);
    }

    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable("id") Integer id){
        employeeRepository.delete(id);
    }

}
