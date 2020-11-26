package com.example.demo.security;


@FunctionalInterface
public interface JTWTokenGenerator {

	public String getToken(String userName, String password);

}
