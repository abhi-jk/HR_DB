package com.ictak.springsecurityclient.service;

import com.ictak.springsecurityclient.entity.Employee;
import com.ictak.springsecurityclient.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long empId) {
        return employeeRepository.findById(empId).get();
    }

    @Override
    public void deleteEmployeeById(Long empId) {
        employeeRepository.deleteById(empId);
    }

    @Override
    public Employee updateEmployee(Long empId, Employee employee) {
        Employee empDB = employeeRepository.findById(empId).get();

        if(Objects.nonNull(employee.getEmpName()) && !"".equalsIgnoreCase(employee.getEmpName())){
            empDB.setEmpName(employee.getEmpName());
        }

        if(Objects.nonNull(employee.getEmpEmail()) && !"".equalsIgnoreCase(employee.getEmpEmail())){
            empDB.setEmpEmail(employee.getEmpEmail());
        }

        if(Objects.nonNull(employee.getEmpPhoneNumber()) && !"".equalsIgnoreCase(employee.getEmpPhoneNumber())){
            empDB.setEmpPhoneNumber(employee.getEmpPhoneNumber());
        }

        return employeeRepository.save(empDB);
    }
}
