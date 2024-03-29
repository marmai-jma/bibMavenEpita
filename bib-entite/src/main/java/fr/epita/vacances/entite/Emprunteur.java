package fr.epita.vacances.entite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Emprunteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmprunteur;

    private String nom;
    private String prenom;

    public Long getIdEmprunteur() {
        return idEmprunteur;
    }

    public void setIdEmprunteur(Long idEmprunteur) {
        this.idEmprunteur = idEmprunteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
