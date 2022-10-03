package com.example.Hospital_Management.Services;

import java.util.List;

import com.example.Hospital_Management.Entity.Patient_details;


public interface Patient_int {
	
	List<Patient_details> GetAll();
	Patient_details Save_patient(Patient_details patient);
	Patient_details Update_patient(Patient_details patient);
	Patient_details Delete_patient(int patientID);
	Patient_details Get_patient(int patientID);
}



