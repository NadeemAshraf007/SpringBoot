package com.example.demo.entity;

import java.sql.Date;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="HOME_TOP_TRENDING_ALL")
public class HomeTopTrendingEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	@Column(name="ID")
	Integer id;
	
	@Column(name="IMAGE")
	byte[] image;
	
	@Column(name="IMAGE_NAME")
	String imageName;
	
	@Column(name="TRENDING_CATEGORY")
	String trendingCategory;
	
	@Column(name="TRENDING_DATE")
	Date trendingDate;
	
	@Column(name="TRENDING_ORDER")
	Integer trendingOrder;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getTrendingCategory() {
		return trendingCategory;
	}

	public void setTrendingCategory(String trendingCategory) {
		this.trendingCategory = trendingCategory;
	}

	public Date getTrendingDate() {
		return trendingDate;
	}

	public void setTrendingDate(Date trendingDate) {
		this.trendingDate = trendingDate;
	}

	public Integer getTrendingOrder() {
		return trendingOrder;
	}

	public void setTrendingOrder(Integer trendingOrder) {
		this.trendingOrder = trendingOrder;
	}

	@Override
	public String toString() {
		return "HomeTopTrendingEntity [id=" + id + ", image=" + Arrays.toString(image) + ", imageName=" + imageName
				+ ", trendingCategory=" + trendingCategory + ", trendingDate=" + trendingDate + ", trendingOrder="
				+ trendingOrder + "]";
	}
	
	
	
	
	

	

}
