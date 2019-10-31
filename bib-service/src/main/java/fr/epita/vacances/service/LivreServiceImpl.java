package fr.epita.vacances.service;

import fr.epita.vacances.dao.LivreDao;
import fr.epita.vacances.entite.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreServiceImpl implements LivreService {
    @Autowired
    LivreDao livreDao;
    public String enregistrerLivre(Livre l) {
        // TODO Auto-generated method stub
        livreDao.creerLivre(l);
        return "SUCCESS";

    }

    public Livre recupererLivre(Long id) {
        // TODO Auto-generated method stub
        return livreDao.trouverLivre(id);
    }

    public void modifierLivre(Livre l) {
        // TODO Auto-generated method stub
        livreDao.modifierLivre(l);
    }

    public void supprimerLivre(Livre l) {
        // TODO Auto-generated method stub
        livreDao.supprimer(l);
    }

    public List<Livre> recupererLivres() {
        // TODO Auto-generated method stub
        return livreDao.findAll();
    }
}
