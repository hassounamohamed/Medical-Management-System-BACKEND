package com.Medical.Management.System.Entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "patients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable   {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    
    private Date dateNaissance;
    @Column(name = "sexe")
    private String sexe;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "groupe_sanguin")
    private String groupe_sanguin;
    @Column(name = "id_dossier")
    private int id_dossier;

    @OneToOne
    @JoinColumn(name = "user_id" , referencedColumnName = "id" , nullable = false)
    private User user;

    @OneToOne (cascade = CascadeType.ALL)
    @JoinColumn(name ="dossier_medical_id", referencedColumnName = "id")
    private DossierMedical dossierMedical;
     



}
