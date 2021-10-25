package com.fullstackcode.springboot.graphql.repository;

import com.fullstackcode.springboot.graphql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface  EmployeeRepository extends JpaRepository<Employee,Integer> {
}
