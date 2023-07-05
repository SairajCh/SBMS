package in.ashokit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
	
	@Autowired
	
	private ReportDao rdao;
	
	
	public void generateReport() {
	rdao.getData();
	System.out.println("Data generated...");
	
	}

}
