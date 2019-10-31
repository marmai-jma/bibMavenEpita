package fr.epita.vacances.dao;

import fr.epita.vacances.entite.Auteur;

public interface AuteurDao {
    void creerAuteur (Auteur a);
    Auteur trouverAuteur (Long id);
    void supprimerAuteur (Long id);
    void modifierAuteur(Auteur a);
}
