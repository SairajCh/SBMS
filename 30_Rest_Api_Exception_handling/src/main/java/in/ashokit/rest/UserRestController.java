package in.ashokit.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.exception.UserNotFoundException;

@RestController
public class UserRestController {

	
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable Integer userId) {
		
		if(userId == 100 ) {
			return "John";
		}else if(userId==200){
			return "Smith";
			
		}else {
			throw new UserNotFoundException("user not found exception");
		}
	}
}
