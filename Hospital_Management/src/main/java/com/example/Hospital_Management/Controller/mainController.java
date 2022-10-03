package com.example.Hospital_Management.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Hospital_Management.Entity.Patient_details;
import com.example.Hospital_Management.Services.Patient_implementation;

@RestController
public class mainController {
	
	@Autowired
	private Patient_implementation patientIMP;
	@GetMapping("/patient")
	public List<Patient_details> GetAll(){
		return this.patientIMP.GetAll();
	}
	
	@PostMapping("/patient")
	public Patient_details Save_patient(@RequestBody Patient_details patient) {
		return this.patientIMP.Save_patient(patient);
	}
	
	@PutMapping("/patient")
	public Patient_details Update_patient(@RequestBody Patient_details patient) {
		return this.patientIMP.Update_patient(patient);
	}
	
	@DeleteMapping("/patient/{patientID}")
	public Patient_details Delete_patient(@PathVariable int patientID) {
		return this.patientIMP.Delete_patient(patientID);
	}

	@GetMapping("/patient/{patientID}")
	public Patient_details Get_patient(@PathVariable int patientID) {
		return this.patientIMP.Get_patient(patientID);
	}
}
