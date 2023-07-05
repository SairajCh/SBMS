package com.ashokit.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class User {

	private Integer userid;
	private String username;
	private String email;
	private String pwd;
	private String gender;
	private Long phno;
	
}
