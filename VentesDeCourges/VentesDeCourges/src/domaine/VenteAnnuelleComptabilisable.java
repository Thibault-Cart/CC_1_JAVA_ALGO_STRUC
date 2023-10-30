package domaine;

public class VenteAnnuelleComptabilisable  {

    private VenteAnnuelle vente;
    private float prix;

    public VenteAnnuelleComptabilisable(VenteAnnuelle vente, float prix) {
        this.vente = vente;
        this.prix = prix;
    }

    public float getPrix(){
        return prix;
    }

    public void Comptabiliser(){
        String affichage="";
        float total;
        if (vente instanceof VenteAnnuelleEnKg){
            affichage="Comptabilisation :"+vente.toString() +" à Frs "+prix+"/kg";
        }else {
            affichage="Comptabilisation :"+vente.toString() +" à Frs "+prix;
        }
        total=prix*vente.getNb();
        affichage+=" = Frs "+total;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
