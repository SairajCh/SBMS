package in.ashokit;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("Prototype")
public class Car {

	public Car() {
	
		System.out.println("car constructor");
		// TODO Auto-generated constructor stub
	}
}
