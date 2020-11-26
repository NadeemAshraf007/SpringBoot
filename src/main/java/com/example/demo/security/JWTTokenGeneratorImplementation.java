package com.example.demo.security;

import org.springframework.stereotype.Component;

@Component
public class JWTTokenGeneratorImplementation {

	public String GetToken() {

		JTWTokenGenerator token = (x, y) -> {
			System.out.println(x+y);
			return x+y;
		};

		return token.getToken("Nadeem", "Ashraf");

	}

}
