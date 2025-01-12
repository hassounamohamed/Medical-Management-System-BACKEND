package com.Medical.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Medical.Management.System.Entity.PersonnelMedical;

public interface PersonnelMedicalRepository extends JpaRepository <PersonnelMedical , Long> {

}
