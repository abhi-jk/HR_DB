package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Employee;
import com.ictak.springsecurityclient.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
//        LOGGER.info("Inside saveDepartment of DepartmentController...");
        return employeeService.saveEmployee(employee);
    }


    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable("id") Long empId){
        return employeeService.getEmployeeById(empId);
    }


    @DeleteMapping("/employee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long empId){
        employeeService.deleteEmployeeById(empId);
        return "Employee deleted successfully";
    }

    @PutMapping("/employee/{id}")
    public Employee updateEmployee(@PathVariable("id") Long empId,@RequestBody Employee employee){
        return employeeService.updateEmployee(empId,employee);
    }
}
