package domaine.lst;

public interface ListeDeValeurs<T> {
    void addVal(T val);
    T getVal(T val);
    int nbVal();
}