package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Department;

public interface DepartmentService {

    Department saveDepartments(Department department);

    Department getDepartmentById(Long departmentId);

    void deleteDepartmentById(Long departmentId);

    Department updateDepartment(Long departmentId, Department department);
}

