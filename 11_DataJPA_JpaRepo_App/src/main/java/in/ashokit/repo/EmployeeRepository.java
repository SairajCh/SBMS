package in.ashokit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
	
	

}
