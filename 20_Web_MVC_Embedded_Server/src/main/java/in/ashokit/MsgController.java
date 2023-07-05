package in.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MsgController {
	
	@GetMapping("/")
	public String welcomeMsg(Model model) {
		model.addAttribute("msg", "Goof Evening");
		return "index";
	}

}
