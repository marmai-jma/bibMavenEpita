package fr.epita.vacances.entite;

import javax.persistence.*;

@Entity
public class Exemplaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codeBarre;

    @ManyToOne
    private Livre livre;

    public Long getCodeBarre() {
        return codeBarre;
    }
}
