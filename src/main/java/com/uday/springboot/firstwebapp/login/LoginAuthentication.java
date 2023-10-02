package com.uday.springboot.firstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthentication {

	public boolean authenticate(String name,String password) {
		boolean isUserValid = name.equalsIgnoreCase("uday");
		boolean isPasswordValid=password.equalsIgnoreCase("1");
		return isUserValid && isPasswordValid;
	}
}
