package com.fil.springjpa.controller;

import com.fil.springjpa.entity.Employee;
import com.fil.springjpa.service.EmployeeService;
import com.fil.springjpa.util.JwtUtil;
import com.fil.springjpa.entity.AuthRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/login")
    public ResponseEntity<Map<String, String>> login(@RequestBody AuthRequest authRequest) {
        String username = authRequest.getUsername();
        String password = authRequest.getPassword();
        String role;

        // Hardcoded login
        if ("admin".equals(username) && "admin".equals(password)) {
            role = "ADMIN";
        } else if ("user".equals(username) && "user".equals(password)) {
            role = "USER";
        } else {
            return ResponseEntity.status(401).body(Collections.singletonMap("error", "Invalid credentials"));
        }

        String token = jwtUtil.generateToken(username, role);
        return ResponseEntity.ok(Collections.singletonMap("accessToken", token));
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @PostMapping("/employees/save")
    public Employee addNewEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable Long id) {
        return this.employeeService.getEmployeeById(id);
    }
}
