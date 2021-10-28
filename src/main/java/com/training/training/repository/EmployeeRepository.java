package com.training.training.repository;

import com.training.training.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By zepaG on 10/26/2021.
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    Employee findByEmployeeId(long id);
}
