  package in.karuna.employee.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.karuna.employee.entity.Employee;
import in.karuna.employee.model.EmployeeResponse;
import in.karuna.employee.repository.EmployeeRepository;
import in.karuna.employee.model.AddressResponse;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private RestTemplate restTemplate;
	
	public Employee createEmployee( Employee emp) {
		return empRepo.save(emp);
	}
	
	public EmployeeResponse findEmployeeById(int id) {
		
		AddressResponse addressResponse = new AddressResponse();
		Employee employee=empRepo.findById(id).orElse(null);
		EmployeeResponse empresponse=modelMapper.map(employee, EmployeeResponse.class);
		
		addressResponse=restTemplate.getForObject("http://localhost:8082/address-api/api/address/{id}", AddressResponse.class, id);
		//empresponse.setEmployerResponse(addressResponse);
		empresponse.setAddressResponse(addressResponse);
		return empresponse;
		}
	
		
	}


