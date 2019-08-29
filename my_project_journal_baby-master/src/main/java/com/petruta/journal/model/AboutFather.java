package com.petruta.journal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ABOUT_FATHER")
public class AboutFather {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String name;
	private String email;
	private String phone;
	private String his_talent;
	private String his_occupation;
	private String his_school;
	
	
	protected AboutFather() {

}




	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getHis_talent() {
		return his_talent;
	}


	public void setHis_talent(String his_talent) {
		this.his_talent = his_talent;
	}


	public String getHis_occupation() {
		return his_occupation;
	}


	public void setHis_occupation(String his_occupation) {
		this.his_occupation = his_occupation;
	}


	public String getHis_school() {
		return his_school;
	}


	public void setHis_school(String his_school) {
		this.his_school = his_school;
	}
	
	
	
	
}
