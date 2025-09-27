package com.fil.springjpa.repository;

import com.fil.springjpa.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class EmployeeRepository {

    private final Map<Long, Employee> employeeMap = new HashMap<>();
    private long idCounter = 1;

    public EmployeeRepository() {
        Employee e1 = new Employee(1L, "Alice", "Developer");
        Employee e2 = new Employee(2L, "Bob", "Manager");
        Employee e3 = new Employee(3L, "Charlie", "Tester");

        employeeMap.put(e1.getId(), e1);
        employeeMap.put(e2.getId(), e2);
        employeeMap.put(e3.getId(), e3);

        idCounter = 4;
    }

    public List<Employee> findAll() {
        return new ArrayList<>(employeeMap.values());
    }

    public Employee save(Employee employee) {
        if (employee.getId() == null) {
            employee.setId(idCounter++);
            employeeMap.put(employee.getId(), employee);
        } else {
            if (employeeMap.containsKey(employee.getId())) {
                throw new IllegalArgumentException("Employee with ID " + employee.getId() + " already exists.");
            } else {
                employeeMap.put(employee.getId(), employee);
            }
        }
        return employee;
    }

    public Optional<Employee> findById(Long id) {
        return Optional.ofNullable(employeeMap.get((Long) id));
    }

}
