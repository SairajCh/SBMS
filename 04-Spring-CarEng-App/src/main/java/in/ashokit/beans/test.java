package in.ashokit.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctxt = new ClassPathXmlApplicationContext("Beans.xml");
		
		Car c = ctxt.getBean(Car.class);
		
		c.drive();
		
//		System.out.println(c1.hashCode());
//		
//		Car c2 = ctxt.getBean(Car.class);
//		System.out.println(c2.hashCode());
			
	}

}
