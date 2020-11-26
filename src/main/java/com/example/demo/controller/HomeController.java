package com.example.demo.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.FooterDataEntity;
import com.example.demo.entity.HeaderDataEntity;
import com.example.demo.entity.HomeTopTrendingEntity;
import com.example.demo.service.HomeService;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private HomeService homeService;

	@RequestMapping(value = "/user/details")
	@GetMapping
	public Map<String, Object> getHomePageData() throws JsonProcessingException {

		List<HomeTopTrendingEntity> homeTopTrendingData = new ArrayList<>();
		homeTopTrendingData = homeService.getTrendingEntities();

		List<HeaderDataEntity> headerData = new ArrayList<>();
		headerData = homeService.getHeaderData();

		List<FooterDataEntity> footerData = new ArrayList<>();
		footerData = homeService.getFooterData();

		Map<String, Object> homeData = new HashMap<String, Object>();
		homeData.put("topTrendingList", homeTopTrendingData);
		homeData.put("headerData", headerData);
		homeData.put("footerData", footerData);

		return homeData;

	}

	@RequestMapping(value= "/user/header/update" ,consumes  =MediaType.APPLICATION_JSON_VALUE )
	@PostMapping
	public String updateHeaderDetails(@RequestBody  HeaderDataEntity  headerDataEntity) {
		
		
		System.out.println(headerDataEntity.toString());
		
		homeService.updateHeaderData(headerDataEntity);
		
		

		return "Save successful";

	}

}
