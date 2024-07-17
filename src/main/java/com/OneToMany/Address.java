package com.OneToMany;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class Address {
	
	@Id
	private int f_no;
	private String a_name;
	private String city;
	
	
	
	public Address(int f_no, String a_name, String city) {
		super();
		this.f_no = f_no;
		this.a_name = a_name;
		this.city = city;
	}



	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getF_no() {
		return f_no;
	}



	public void setF_no(int f_no) {
		this.f_no = f_no;
	}



	public String getA_name() {
		return a_name;
	}



	public void setA_name(String a_name) {
		this.a_name = a_name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	@Override
	public String toString() {
		return "Address [f_no=" + f_no + ", a_name=" + a_name + ", city=" + city + "]";
	}
	
	

}
