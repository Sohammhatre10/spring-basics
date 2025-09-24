package com.fil.springjpa.service;

import java.util.List;
import com.fil.springjpa.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import com.fil.springjpa.entity.Employee;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

}
