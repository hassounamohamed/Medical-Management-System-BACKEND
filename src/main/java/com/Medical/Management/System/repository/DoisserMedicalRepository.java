package com.Medical.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Medical.Management.System.Entity.DossierMedical;
@Repository
public interface DoisserMedicalRepository extends JpaRepository <DossierMedical, Long> {

}
