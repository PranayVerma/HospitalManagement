package com.example.Hospital_Management.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Hospital_Management.DAO.PatientDAO;
import com.example.Hospital_Management.DAO.roomsDAO;
import com.example.Hospital_Management.Entity.Patient_details;
import com.example.Hospital_Management.Entity.rooms;
@Service
public class Patient_implementation implements Patient_int {

	@Autowired
	PatientDAO DAO;
	@Autowired
	roomsDAO DAO1;
	
	@Override
	public List<Patient_details> GetAll() {
		
		// TODO Auto-generated method stub
		rooms r = new rooms();
		for(int i =1;i<=100;i++) {
			r.setRid(i);
			r.setStatus("Available");
			DAO1.save(r);
		}
		return DAO.findAll();
		
	}

	@Override
	public Patient_details Save_patient(Patient_details patient) {
		// TODO Auto-generated method stub
		int rid=patient.getRid();
		rooms r=DAO1.findById(rid);
		r.setStatus("Not Available");
		r.setPatient(patient);
		DAO1.save(r);
		return DAO.save(patient);
	}

	@Override
	public Patient_details Update_patient(Patient_details patient) {
		// TODO Auto-generated method stub
		return DAO.save(patient);
	}

	@Override
	public Patient_details Delete_patient(int patientID) {
		// TODO Auto-generated method stub
		Patient_details patient=DAO.findById(patientID);
		int rid=patient.getRid();
		rooms r=DAO1.findById(rid);
		if(r.getPatient().equals(patient)) {
		r.setStatus("Available");
		r.setPatient(null);
		DAO1.save(r);
		}
		return DAO.deleteById(patientID);
	}

	@Override
	public Patient_details Get_patient(int patientID) {
		// TODO Auto-generated method stub
		return DAO.findById(patientID);
	}
	
	

	
}
