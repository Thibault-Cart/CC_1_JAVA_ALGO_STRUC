package dao;

// TODO: ========== vous pouvez modifier tout ce que vous voulez dans le chargement des données ==========

import domaine.*;
import domaine.lst.ListeDesVentesDansTableau;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Bdd {
    /** @return tout le fichier LstCourges.csv dans une List<Courge> */
    public static List<Courge> getListeDesCourges() {
        List<Courge> data = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("LstCourges.csv"));
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] champs = ligne.split(";");
                // liste des champs: n° ; nom ; kg/pc ;  annee;nb;prix  ;  annee;nb;prix  ; ...
                // TODO: remplacer la liste des ventes dans un tableau par VOTRE implémentation dans une liste chaînée
                Courge c = new Courge(Integer.parseInt(champs[0]), champs[1], new ListeDesVentesDansTableau<>());
                if (champs[2].equalsIgnoreCase("kg"))
                    // TODO: à vous d'adapter la version ci-dessous qui ne récupère pas les prix (uniquement année et nombre) !
                     { for (int i=3; i<champs.length; i+=3) { c.addVente(new VenteAnnuelleEnKg(Integer.parseInt(champs[i]), Integer.parseInt(champs[i+1]))); } }
                else { for (int i=3; i<champs.length; i+=3) { c.addVente(new VenteAnnuelleEnNb(Integer.parseInt(champs[i]), Integer.parseInt(champs[i+1]))); } }
                data.add(c);
            }
            reader.close();
        } catch (IOException e) { e.printStackTrace(); }
        return data;
    }
}