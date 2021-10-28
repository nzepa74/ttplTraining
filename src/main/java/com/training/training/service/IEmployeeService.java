package com.training.training.service;

import com.training.training.modal.Employee;

import java.util.List;

/**
 * Created By zepaG on 10/26/2021.
 */
public interface IEmployeeService {
    Employee saveEmployee(Employee employee);
    List<Employee> getAllEmployees();
    Employee getEmployeeById(long id);
    Employee updateEmployee(Employee employee, long id);
    void deleteEmployee(long id);
}
