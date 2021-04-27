package com.springmongoprg.springmongoproject.controller;

import com.springmongoprg.springmongoproject.model.Employee;
import com.springmongoprg.springmongoproject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/saveEmployee")
    public String addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee added";
    }

    @GetMapping("/getEmployees")
    public List<Employee> getEmployeeList(){
        return employeeRepository.findAll();
    }

    @GetMapping("/search/{searchString}")
    public List<Employee> searchEmp(@PathVariable String searchString){
        return employeeRepository.searchEmployee(searchString);
    }

}
