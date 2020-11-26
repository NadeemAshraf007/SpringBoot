package com.example.demo.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="FOOTER_DATA_DETAILS")
public class FooterDataEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ_FOOTER")
	@Column(name="FOOTER_ID")
	Integer id;
	
	@Column(name="LABLE", length = 50)
	String lable;
	
	@Column(name="TYPE" , length = 50)
	String type;
	
	@Column(name="IMAGE")
	byte[] image;
	
	@Column(name="url", length = 100)
	String  url;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLable() {
		return lable;
	}

	public void setLable(String lable) {
		this.lable = lable;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "FooterDataEntity [id=" + id + ", lable=" + lable + ", type=" + type + ", image="
				+ Arrays.toString(image) + ", url=" + url + "]";
	}
	
	
	

}
