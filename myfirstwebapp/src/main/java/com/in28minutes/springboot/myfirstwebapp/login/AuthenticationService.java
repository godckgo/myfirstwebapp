package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	public boolean autenticate(String username, String password) {
		boolean isValidUsername = username.equalsIgnoreCase("yunz");
		boolean isValidPassword = password.equalsIgnoreCase("dummy");
		
		return isValidUsername && isValidPassword;
	}
}
