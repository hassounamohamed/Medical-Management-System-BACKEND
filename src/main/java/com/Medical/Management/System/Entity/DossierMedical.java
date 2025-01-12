package com.Medical.Management.System.Entity;


import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "dossier_medical")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DossierMedical implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_creation" , nullable = false)
    private Date dateCreation;
    @Column(name = "diagnostic", nullable = false)
    private String diagnostic;
    @Column(name = "traitement", nullable = false)
    private String traitement;
    @Column(name = "observations", nullable = false)
    private String observations;

    @OneToOne(mappedBy = "dossierMedical")
    private Patient patient;


}
