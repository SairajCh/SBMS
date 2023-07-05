package in.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MsgController {
	
	@GetMapping("/welcome")
	public String getWelcome(Model model) {
		model.addAttribute("msg", "Welcome to Thymeleaf pages...");
		return "index";
	}
	
	@PostMapping("/greet")
	public String getGreetMsg(Model model) {
		
		model.addAttribute("msg", "Good evening....");
		return "index";
	}

}
