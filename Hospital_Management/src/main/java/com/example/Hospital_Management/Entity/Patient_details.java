package com.example.Hospital_Management.Entity;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
public class Patient_details {
	
	@Id
	private int patientID;
	private String name;
	private int age;
	private String phone;
	private String Address;
	private String aadharNo;
	private int rid;
	
	
	public Patient_details() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient_details(int patientID, String name, int age, String phone, String address, String aadharNo,
			int rid) {
		super();
		this.patientID = patientID;
		this.name = name;
		this.age = age;
		this.phone = phone;
		Address = address;
		this.aadharNo = aadharNo;
		this.rid = rid;
	}


	public int getPatientID() {
		return patientID;
	}


	public void setPatientID(int patientID) {
		this.patientID = patientID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public String getAadharNo() {
		return aadharNo;
	}


	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}
	
	
}
