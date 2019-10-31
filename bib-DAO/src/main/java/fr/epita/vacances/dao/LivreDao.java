package fr.epita.vacances.dao;

import fr.epita.vacances.entite.Livre;

import java.util.List;

public interface LivreDao {
    void creerLivre(Livre l);
    Livre trouverLivre (Long id);
    List<Livre> findAll();
    void supprimer(Livre l);
    void modifierLivre (Livre l);
}
