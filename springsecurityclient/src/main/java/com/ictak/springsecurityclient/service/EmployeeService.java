package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Employee;

public interface EmployeeService {

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(Long empId);

    void deleteEmployeeById(Long empId);

    Employee updateEmployee(Long empId, Employee employee);
}
