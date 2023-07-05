package in.ashokit;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import in.ashokit.entity.Employee;
import in.ashokit.repo.EmployeeRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		EmployeeRepository repository = context.getBean(EmployeeRepository.class);
		// System.out.println(repository.getClass().getName());

		/*
		 * Employee e1 = new Employee(1, "john", 4000.00, "Male", "Sales"); Employee e2
		 * = new Employee(2, "Charles", 5000.00, "Male", "Admin"); Employee e3 = new
		 * Employee(3, "Smith", 5000.00, "Male", "Account"); Employee e4 = new
		 * Employee(4, "Cathy", 6000.00, "Fe-Male", "HR"); Employee e5 = new Employee(5,
		 * "Robert", 8000.00, "Male", "Manager");
		 * 
		 * 
		 * repository.saveAll(Arrays.asList(e1,e2,e3,e4,e5));
		 * System.out.println("Entries saved...");
		 */
//		
//		List<Employee> emps = repository.findAll();
//		
//		emps.forEach(System.out::println);
		
//		Optional<Employee> findById = repository.findById(1);
//		System.out.println(findById.get());
		
	
//		Sort sort = Sort.by("empSal ary","empId").ascending();
//		
//		List<Employee> emps = repository.findAll(sort);
//		
//		emps.forEach(System.out::println);
//	
//		int pageNo=2;
//		PageRequest pageRequest = PageRequest.of(pageNo-1, 3);
//	
//	
//		Page<Employee> findAll = repository.findAll(pageRequest);
//		List<Employee> emps = findAll.getContent();
//		
//		emps.forEach(System.out::println);
		
		
		
	
		
//		Employee emp = new Employee();
//		emp.setEmpGender("Male");
//
//		Example<Employee> of = Example.of(emp);
//		List<Employee> emps = repository.findAll(of);
		
	
		
		Employee e = new Employee();
		
		e.setEmpName("Ram");
		e.setEmpGender("Male");
		e.setEmpSalary(600.00);
		e.setDept("sales");
		//e.setEmpId(2);
		
 		Employee save = repository.save(e);
 		System.out.println(save);
		
		
		
		
		
	}

}
