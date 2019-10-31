package fr.epita.vacances.service;

import fr.epita.vacances.entite.Livre;

import java.util.List;

public interface LivreService {
    String enregistrerLivre(Livre l);
    Livre recupererLivre(Long id);
    void modifierLivre (Livre l);
    void supprimerLivre(Livre l);
    List<Livre> recupererLivres();
}
