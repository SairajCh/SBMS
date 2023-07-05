package in.ashokit.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {
	
	
	
	@GetMapping("/greet")
	public String getGreetMsg(Model model) {
		
		String msgTxt="welcome to ashokit";
		
		model.addAttribute("msg",msgTxt);
		return "index";
		
	}
	
	
	@GetMapping("/wish")
	public String geWishtMsg(Model model) {
		
		String msgTxt="Good Evening";
		
		int i=10/0;
		
		String s=null;
		System.out.println(s.length());
		model.addAttribute("msg",msgTxt);
		return "index";
		
	}
	
	

}
