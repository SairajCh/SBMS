package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;

	@GetMapping("/welcome")
	public String getWelcomeMsg() {

		String greetRsp = greetClient.invokeGreetApi();
	

		return greetRsp+ "Welcome to Ashok IT";
	}

}
