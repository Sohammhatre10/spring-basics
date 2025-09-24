package com.fil.springjpa.repository;

import com.fil.springjpa.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class EmployeeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<Employee> findAll() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class)
                .getResultList();
    }

    public Employee save(Employee employee) {
        if (employee.getId() == null) {
            entityManager.persist(employee); // insert
            return employee;
        } else {
            return entityManager.merge(employee); // update
        }
    }
}
