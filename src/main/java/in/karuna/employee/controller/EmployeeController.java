package in.karuna.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.karuna.employee.entity.Employee;
import in.karuna.employee.model.EmployeeResponse;
import in.karuna.employee.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService empService;
	
	@PostMapping("/employee")
	public Employee createEmp(@RequestBody Employee emp) {
		return empService.createEmployee(emp);
	}

	@GetMapping("/{id}")
	public EmployeeResponse getEmpById(@PathVariable int id) {
		return empService.findEmployeeById(id);
	}
}
