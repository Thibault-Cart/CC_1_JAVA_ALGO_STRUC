package domaine;

public class VenteAnnuelleEnKg extends VenteAnnuelle {
    public VenteAnnuelleEnKg(int annee, int nb) { super(annee, nb); }

    @Override
    public String toString() { return super.toString() + "kg"; }
}