package com.fil.springjpa.service;

import java.util.List;
import com.fil.springjpa.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import org.springframework.web.bind.annotation.RequestBody;

import com.fil.springjpa.entity.Employee;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return this.employeeRepository.findAll();
    }

    public Employee addEmployee(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    public Employee getEmployeeById(Long id) {
        return this.employeeRepository.findById(id).orElse(null);
    }

}
