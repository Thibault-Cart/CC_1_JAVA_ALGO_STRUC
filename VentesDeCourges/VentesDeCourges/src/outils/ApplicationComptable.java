package outils;

// TODO: ========== vous pouvez modifier tout ce que vous voulez dans cette application en cours de développement ==========

import domaine.Courge;

import java.util.ArrayList;
import java.util.List;

public class ApplicationComptable {
    private static List ecrituresAComptabiliser = new ArrayList();    // contient toutes les écritures en attente de comptabilisation


    public ApplicationComptable() {
        // TODO: effectue la comptabilisation (appelle la méthode comptabiliser) pour toutes les écritures en attente
        for (Object ecriture : ecrituresAComptabiliser) {
//            ecriture.comptabiliser();   // TODO: appeler correctement la méthode comptabiliser()
        }
    }

    public static void mettreEnAttenteDeComptabilisation(Object ecriture) {

        ecrituresAComptabiliser.add(ecriture); }
}