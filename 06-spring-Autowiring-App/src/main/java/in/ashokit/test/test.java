package in.ashokit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ashokit.AppConfig;
import in.ashokit.beans.ReportService;

public class test {

	public static void main(String args[]) { 
	
		ApplicationContext ctxt =
				new AnnotationConfigApplicationContext(AppConfig.class);
	ReportService service = ctxt.getBean(ReportService.class);
	service.generateReport();


}
}
