package domaine.lst;

import domaine.VenteAnnuelleComptabilisable;

public class ListeChaineeVente<T> extends ListeDesVentesDansTableau {

    private Noeud refSurFinDeFilePourAdd, refSurDebutDeFilePourRemove;

    private class Noeud {
        private T val;
        private Noeud ref;
        Noeud(T val, Noeud ref) { this.val=val; this.ref=ref; }
    }

    public ListeChaineeVente() { refSurFinDeFilePourAdd = refSurDebutDeFilePourRemove = null; }

    @Override
    public void addVal(VenteAnnuelleComptabilisable val) {
        Noeud nouveau = new Noeud((T) val, null);
        if (isEmpty()) {
            refSurFinDeFilePourAdd = refSurDebutDeFilePourRemove = nouveau;
        } else {
            refSurFinDeFilePourAdd.ref = nouveau;
            refSurFinDeFilePourAdd = nouveau;
        }
    }


    public T getVal() {
        if (isEmpty()) { throw new RuntimeException("File vide !"); }
        T val = refSurDebutDeFilePourRemove.val;
        refSurDebutDeFilePourRemove = refSurDebutDeFilePourRemove.ref;
        if (refSurDebutDeFilePourRemove == null) { refSurFinDeFilePourAdd = null; }
        return val;
    }

    public boolean isEmpty() { return refSurDebutDeFilePourRemove==null; }

}

