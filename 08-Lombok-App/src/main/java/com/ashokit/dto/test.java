package com.ashokit.dto;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User u = new User();
		u.setGender("male");
	
		 User u1 = new User() ;
		Boolean s= u.canEqual(u1);
		
		System.out.println(s);
	}

}
