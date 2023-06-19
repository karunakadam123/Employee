package in.karuna.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.karuna.employee.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
