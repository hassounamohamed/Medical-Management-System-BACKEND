package com.Medical.Management.System.Entity;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "rendez_vous")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Long id;
    @Temporal(TemporalType.DATE)
    @Column(name = "date_rdv" , nullable = false)
    private Date dateRdv;
    @Column(name = "heure_rdv", nullable = false)
    private Time heurRdv;
    @Column(name = "statut", nullable = false)
    private String statut;

    @ManyToOne
    @JoinColumn(name = "personnel_medical_id" , referencedColumnName = "id")
    private PersonnelMedical personnelMedical;

    @ManyToOne
    @JoinColumn(name = "patient_id" , referencedColumnName = "id")
    private Patient patient;

}
