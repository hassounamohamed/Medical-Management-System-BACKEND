package com.Medical.Management.System.Entity;




import java.io.Serializable;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;


@Entity
@Table (name = "user")
@Data
@AllArgsConstructor

public class User implements Serializable  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false, length = 50)
    private String nom;
    @Column(nullable = false, length = 50)
    private String prenom;
    @Column(nullable = false, unique = true ,length = 100)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private String role;

    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL)
    private Patient patient;

    @OneToOne(mappedBy = "user" , cascade = CascadeType.ALL)
    private PersonnelMedical personnelMedical;
    


}
