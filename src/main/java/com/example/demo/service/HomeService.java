package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.HomeDao;
import com.example.demo.entity.FooterDataEntity;
import com.example.demo.entity.HeaderDataEntity;
import com.example.demo.entity.HomeTopTrendingEntity;

@Service
public class HomeService {

	@Autowired
	private HomeDao homeDao;

	public List<HomeTopTrendingEntity> getTrendingEntities() {

		List<HomeTopTrendingEntity> lstData = new ArrayList<>();
		lstData = homeDao.getTopTrendingData();

		return lstData;

	}

	public List<HeaderDataEntity> getHeaderData() {

		List<HeaderDataEntity> lstData = new ArrayList<>();
		lstData = homeDao.getHeaderDataDetails();

		return lstData;

	}

	public List<FooterDataEntity> getFooterData() {

		List<FooterDataEntity> lstData = new ArrayList<>();
		lstData = homeDao.getFooterDataDetails();

		return lstData;

	}

	public boolean updateHeaderData(HeaderDataEntity headerDataEntity) {

		return homeDao.updateHeaderDetails(headerDataEntity);

	}

}
