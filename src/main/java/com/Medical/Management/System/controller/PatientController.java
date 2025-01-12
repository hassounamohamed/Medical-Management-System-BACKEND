package com.Medical.Management.System.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Medical.Management.System.Entity.Patient;
import com.Medical.Management.System.repository.PatientRepository;

@RestController
@RequestMapping("/api/v1")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    public PatientController (PatientRepository patientRepository){
        super();
        this.patientRepository = patientRepository;
    }

    @PostMapping("/insert")
    public Patient createPatient (@RequestBody Patient patient){
        return patientRepository.save(patient);
    }

}
