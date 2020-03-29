package com.stock.mvc.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name = "article")
public class Article implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idActicle;

	public Long getIdActicle() {
		return idActicle;
	}

	public void setIdActicle(Long idActicle) {
		this.idActicle = idActicle;
	}
	
}
