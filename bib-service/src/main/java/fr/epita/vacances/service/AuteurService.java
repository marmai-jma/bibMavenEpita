package fr.epita.vacances.service;

import fr.epita.vacances.entite.Auteur;

public interface AuteurService {
    String enregistrerAuteur(Auteur a);
    Auteur recupererAuteur(Long id);
    void modifierAuteur (Auteur a);
    void supprimerAuteur(Long id);
}
