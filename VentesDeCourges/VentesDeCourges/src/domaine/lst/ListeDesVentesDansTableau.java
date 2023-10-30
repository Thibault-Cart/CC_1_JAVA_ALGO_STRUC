package domaine.lst;

import java.util.ArrayList;
import java.util.List;

public class ListeDesVentesDansTableau<T> implements ListeDeValeurs<T> {
    private List<T> lst;

    public ListeDesVentesDansTableau() { lst = new ArrayList<>(); }

    @Override
    public void addVal(T val) { lst.add(val); }

    @Override
    public T getVal(T val) { int pos=lst.indexOf(val); return pos==-1 ? null : lst.get(pos); }

    @Override
    public String toString() { return lst.toString(); }

    @Override
    public int nbVal() { return lst.size(); }
}