package com.fullstackcode.springboot.graphql.repository;

import com.fullstackcode.springboot.graphql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DepartmentRepository extends JpaRepository<Department,Integer> {
}
