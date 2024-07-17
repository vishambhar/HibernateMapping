package com.OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;


@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int r_no;
	private String name;
	private String branch;
	
	@OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "s_no")
	@OrderColumn(name = "type")
	private List<Address>address;
	
	
	public Student(String name, String branch, List<Address> address) {
		super();
		this.name = name;
		this.branch = branch;
		this.address = address;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getR_no() {
		return r_no;
	}


	public void setR_no(int r_no) {
		this.r_no = r_no;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public List<Address> getAddress() {
		return address;
	}


	public void setAddress(List<Address> address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Student [r_no=" + r_no + ", name=" + name + ", branch=" + branch + ", address=" + address + "]";
	}
	
	

}
