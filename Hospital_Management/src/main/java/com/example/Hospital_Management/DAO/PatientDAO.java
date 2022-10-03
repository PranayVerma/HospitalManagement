package com.example.Hospital_Management.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Hospital_Management.Entity.Patient_details;

public interface PatientDAO extends JpaRepository<Patient_details,Integer>{
	
	Patient_details deleteById(int patientID);
	Patient_details findById(int patientID);
	

}
