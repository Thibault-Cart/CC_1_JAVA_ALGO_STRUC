package domaine.lst;

import domaine.VenteAnnuelleComptabilisable;

public interface ListeDeValeurs<T> {
    void addVal(VenteAnnuelleComptabilisable val);
    T getVal(T val);
    int nbVal();
}