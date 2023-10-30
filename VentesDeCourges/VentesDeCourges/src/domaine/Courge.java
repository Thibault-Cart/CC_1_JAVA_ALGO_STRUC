package domaine;

import domaine.lst.ListeDeValeurs;

import java.util.Objects;

public class Courge {
    private int no;
    private String nom;
    private ListeDeValeurs<VenteAnnuelle> listeDesVentes;

    public Courge(int no, String nom, ListeDeValeurs<VenteAnnuelle> listeDesVentes) {
        this.no = no;
        this.nom = nom;
        this.listeDesVentes = listeDesVentes;
    }

    public void addVente(VenteAnnuelleComptabilisable v) { listeDesVentes.addVal(v); }
    public VenteAnnuelle getVente(int annee) { return listeDesVentes.getVal(new VenteAnnuelle(annee)); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Courge courge = (Courge) o;
        return no == courge.no;
    }

    @Override
    public int hashCode() { return Objects.hash(no); }

    @Override
    public String toString() { return no + ":" + nom + ", " + (listeDesVentes.nbVal()>0 ? listeDesVentes.nbVal() + " stat annuelle: " + listeDesVentes : "aucune stat"); }
}