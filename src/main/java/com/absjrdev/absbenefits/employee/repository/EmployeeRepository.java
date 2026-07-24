package com.absjrdev.absbenefits.employee.repository;

import com.absjrdev.absbenefits.employee.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
