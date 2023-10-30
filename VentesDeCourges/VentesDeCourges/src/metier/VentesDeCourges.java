package metier;

// TODO: ========== vous pouvez modifier tout ce que vous voulez dans cette application en cours de développement ==========

import domaine.Courge;
import domaine.VenteAnnuelle;
import outils.ApplicationComptable;

import java.util.List;

public class VentesDeCourges {
    private List<Courge> lst = dao.Bdd.getListeDesCourges();

    public VentesDeCourges() {
        afficherToutesLesCourges();
        preparerLaComptabilisationDesVentesDe(2022);
    }

    private void afficherToutesLesCourges() {
        for (Courge c : lst) { System.out.println(c); }
    }

    private void preparerLaComptabilisationDesVentesDe(int annee) {
        for (Courge c : lst) {
            VenteAnnuelle vente = c.getVente(annee);
            if (vente != null) { ApplicationComptable.mettreEnAttenteDeComptabilisation(vente); }
        }
    }
}