package com.example.demo.security;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Order(0)
public class SecurityConfigurations2  implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {


		HttpServletRequest httpRequest = (HttpServletRequest) request;
		Enumeration<String> headerNames = httpRequest.getHeaderNames();

		if (headerNames != null) {
			while (headerNames.hasMoreElements()) {
				System.out.println("Header: " + httpRequest.getHeader(headerNames.nextElement()));
			}
		}

		chain.doFilter(request, response);

	}


}
