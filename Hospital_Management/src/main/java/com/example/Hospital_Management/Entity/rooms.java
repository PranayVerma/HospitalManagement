package com.example.Hospital_Management.Entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
public class rooms {
	
	@Id
	private int rid;
	private String Status;
	
	@ManyToOne(cascade= {CascadeType.ALL})
	public Patient_details patient;

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Patient_details getPatient() {
		return patient;
	}

	public void setPatient(Patient_details patient) {
		this.patient = patient;
	}

	public rooms(int rid, int roomNO,  String status, Patient_details patient) {
		super();
		this.rid = rid;
		Status = status;
		this.patient = patient;
	}

	public rooms() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "rooms [rid=" + rid + ", Status=" + Status
				+ ", patient=" + patient + "]";
	}
	
}
