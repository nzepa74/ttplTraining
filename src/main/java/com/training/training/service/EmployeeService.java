package com.training.training.service;

import com.training.training.modal.Employee;
import com.training.training.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created By zepaG on 10/26/2021.
 */
@Service
public class EmployeeService implements IEmployeeService{
    private final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
//		Optional<Employee> employee = employeeRepository.findById(id);
//		if(employee.isPresent()) {
//			return employee.get();
//		}else {
//			throw new ResourceNotFoundException("Employee", "Id", id);
//		}
        return employeeRepository.findByEmployeeId(id);
    }

    @Override
    public Employee updateEmployee(Employee employee, long id) {

        // we need to check whether employee with given id is exist in DB or not
        Employee existingEmployee = employeeRepository.findByEmployeeId(id);

        existingEmployee.setFirstName(employee.getFirstName());
        existingEmployee.setLastName(employee.getLastName());
        existingEmployee.setEmail(employee.getEmail());
        // save existing employee to DB
        employeeRepository.save(existingEmployee);
        return existingEmployee;
    }

    @Override
    public void deleteEmployee(long id) {
//        Employee existingEmployee = new Employee();
//        existingEmployee.setEmployeeId(id);
//        employeeRepository.delete(existingEmployee);
        
                employeeRepository.deleteById(id);
    }
}
