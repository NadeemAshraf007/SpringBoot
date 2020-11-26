package com.example.demo.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.FooterDataEntity;
import com.example.demo.entity.HeaderDataEntity;
import com.example.demo.entity.HomeTopTrendingEntity;

@Repository
public class HomeDao {
	@Autowired
	EntityManager entityManager;

	public List<HomeTopTrendingEntity> getTopTrendingData() {

		Session session = entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<HomeTopTrendingEntity> lstData = session.createQuery("FROM HomeTopTrendingEntity").getResultList();
		System.out.println(lstData);
		session.close();

		return lstData;

	}

	public List<HeaderDataEntity> getHeaderDataDetails() {

		Session session = entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<HeaderDataEntity> lstData = session.createQuery("FROM HeaderDataEntity").getResultList();
		System.out.println(lstData);
		session.close();

		return lstData;

	}

	public List<FooterDataEntity> getFooterDataDetails() {

		Session session = entityManager.unwrap(Session.class);
		@SuppressWarnings("unchecked")
		List<FooterDataEntity> lstData = session.createQuery("FROM FooterDataEntity").getResultList();
		System.out.println(lstData);
		session.close();
		return lstData;

	}

	public boolean updateTrendingDetailsDetails(HomeTopTrendingEntity homeTopTrendingEntity) {

		try {

			Session session = entityManager.unwrap(Session.class);
			session.beginTransaction();
			session.saveOrUpdate(homeTopTrendingEntity);
			session.getTransaction().commit();
			session.close();

		} catch (Exception e) {
			return false;

		}

		return true;

	}

	public boolean updateHeaderDetails(HeaderDataEntity headerDataEntity) {

		try {

			Session session = entityManager.unwrap(Session.class);
			session.beginTransaction();
			session.saveOrUpdate(headerDataEntity);
			session.getTransaction().commit();
			session.close();
			

		} catch (Exception e) {
			return false;

		}

		return true;

	}

	public boolean updateFooterDetails(FooterDataEntity footerDataEntity) {

		try {

			Session session = entityManager.unwrap(Session.class);
			session.beginTransaction();
			session.saveOrUpdate(footerDataEntity);
			session.getTransaction().commit();
			session.close();
		} catch (Exception e) {
			return false;

		}

		return true;

	}
}
