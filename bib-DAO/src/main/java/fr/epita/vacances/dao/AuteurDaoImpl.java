package fr.epita.vacances.dao;

import fr.epita.vacances.entite.Auteur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

// cette classe n'est probablement pas fonctionnelle
@Repository
public class AuteurDaoImpl implements AuteurDao{
    @PersistenceContext(unitName = "bibliothequePU" )
    EntityManager em;

    public void creerAuteur(Auteur a) {
        em.persist(a);
    }

    public Auteur trouverAuteur(Long id) {
        return em.find(Auteur.class, id);
    }

    public void supprimerAuteur(Long id) {
        Auteur a = trouverAuteur(id);
        em.remove(a);

    }

    public void modifierAuteur(Auteur a) {
        em.merge(a);
    }
}
