package com.fullstackcode.springboot.graphql.services;

import com.fullstackcode.springboot.graphql.entity.Department;
import com.fullstackcode.springboot.graphql.entity.Employee;
import com.fullstackcode.springboot.graphql.repository.DepartmentRepository;
import com.fullstackcode.springboot.graphql.repository.EmployeeRepository;
import graphql.GraphQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    DepartmentRepository departmentRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.getById(id);
    }

    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

   public Boolean updateEmpDepartment(Integer emp_id , Integer dept_id) {
        Employee employee = employeeRepository.getById(emp_id);
        if(employee == null) {
            throw new GraphQLException("Employee with id "+emp_id+" not found");
        }

        Department department = departmentRepository.getById(dept_id);
        if(department == null) {
            throw new GraphQLException("Department with id "+dept_id+" not found");
        }

        employee.setDepartment(department);
        employeeRepository.save(employee);

        return true;
    }
}
