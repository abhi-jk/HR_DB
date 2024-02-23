package com.ictak.springsecurityclient.controller;

import com.ictak.springsecurityclient.entity.Department;
import com.ictak.springsecurityclient.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;
    @PostMapping("/departments")
    public Department saveDepartments(@RequestBody Department department){
//        LOGGER.info("Inside saveDepartment of DepartmentController...");
        return departmentService.saveDepartments(department);
    }


    @GetMapping("/departments/{id}")
    public Department getDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.getDepartmentById(departmentId);
    }


    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted successfully";
    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId,@RequestBody Department department){
        return departmentService.updateDepartment(departmentId,department);
    }
}

