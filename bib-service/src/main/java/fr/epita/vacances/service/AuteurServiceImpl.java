package fr.epita.vacances.service;

import fr.epita.vacances.dao.AuteurDao;
import fr.epita.vacances.entite.Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuteurServiceImpl {
    @Autowired
    AuteurDao auteurDao;

    public String enregistrerAuteur(Auteur a) {
        // TODO Auto-generated method stub
        auteurDao.creerAuteur(a);
        return "SUCCESS";
    }

    public Auteur recupererAuteur(Long id) {
        // TODO Auto-generated method stub
        return auteurDao.trouverAuteur(id);
    }

    public void modifierAuteur(Auteur a) {
        // TODO Auto-generated method stub
        auteurDao.modifierAuteur(a);

    }

    public void supprimerAuteur(Long id) {
        // TODO Auto-generated method stub
        auteurDao.supprimerAuteur(id);

    }

}
