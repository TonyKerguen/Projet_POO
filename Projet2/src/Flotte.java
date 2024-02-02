import java.util.ArrayList;
import java.util.List;

public class Flotte {

    private String nom;
    private List<Vaisseau> vaisseaux;

    public Flotte(String nom) {
        this.vaisseaux = new ArrayList<Vaisseau>();
        this.nom = nom;
    }

    public Flotte() {
        this.vaisseaux = new ArrayList<Vaisseau>();
        this.nom = "Nouvelle Flotte";
    }

    public void ajoute(Vaisseau vaisseau) {
        this.vaisseaux.add(vaisseau);
    }

    public String getNom() {
        return this.nom;
    }

    public int nombreVaisseaux() {
        return this.vaisseaux.size();
    }

    public int totalPuissance() {
        int totalPuissance = 0;
        for(Vaisseau v : this.vaisseaux) {
            totalPuissance += v.getPuissance();
        }
        return totalPuissance;
    }

    public void ajoute(String nom, int puissanceDeFeu) {
        this.vaisseaux.add(new Vaisseau(nom, puissanceDeFeu));
    }

    public void ajoute(String nom, int puissanceDeFeu, int nombreDePassagers) {
        this.vaisseaux.add(new Vaisseau(nom, puissanceDeFeu, nombreDePassagers));
    }

    public int nombreDeVaisseauxSansPassagers() {
        int nombreDeVaisseauxSansPassagers = 0;
        for(Vaisseau v : this.vaisseaux) {
            if(v.getNombrePassagers() == 0) {
                nombreDeVaisseauxSansPassagers += 1;
            }
        }
        return nombreDeVaisseauxSansPassagers;
    }

    public int puissanceDeFeuMax() {
        int puissanceDeFeuMax = 0;
        for(Vaisseau v : this.vaisseaux) {
            if(v.getPuissance() > puissanceDeFeuMax) {
                puissanceDeFeuMax = v.getPuissance();
            }
        }
        return puissanceDeFeuMax;
    }

    public String nomDuVaisseauLeMoinsPuissant() {
        String nomDuVaisseauLeMoinsPuissant = this.vaisseaux.get(0).getNom();
        int puissanceMin = this.vaisseaux.get(0).getPuissance();
        for(Vaisseau v : this.vaisseaux){
            if(v.getPuissance() < puissanceMin){
                nomDuVaisseauLeMoinsPuissant = v.getNom();
                puissanceMin = v.getPuissance();
            }
        }
        return nomDuVaisseauLeMoinsPuissant;
    }

}
