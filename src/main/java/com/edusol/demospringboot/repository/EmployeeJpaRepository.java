package com.edusol.demospringboot.repository;

import com.edusol.demospringboot.model.Employee;
import com.edusol.demospringboot.model.EmployeeTable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeJpaRepository extends JpaRepository<EmployeeTable,Long> {
}
