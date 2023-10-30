package domaine;

import java.util.Objects;

public class VenteAnnuelle {
    private int annee;
    private int nb;

    public VenteAnnuelle(int annee) { this.annee = annee; }
    public VenteAnnuelle(int annee, int nb) { this.annee = annee; this.nb = nb; }

    public int getAnnee() { return annee; }
    public int getNb() { return nb; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        VenteAnnuelle that = (VenteAnnuelle) o;
        return annee == that.annee;
    }

    @Override
    public int hashCode() { return Objects.hash(annee); }

    @Override
    public String toString() { return annee + "=" + nb; }
}