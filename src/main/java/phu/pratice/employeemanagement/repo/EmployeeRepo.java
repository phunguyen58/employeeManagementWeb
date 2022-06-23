package phu.pratice.employeemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import phu.pratice.employeemanagement.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
