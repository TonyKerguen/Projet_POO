public class Vaisseau {

    private String nom;
    private int nombreDePassagers;
    private int puissanceDeFeu;

    public Vaisseau(String nom, int puissanceDeFeu) {
        this.nom = nom;
        this.nombreDePassagers = 0;
        this.puissanceDeFeu = puissanceDeFeu;
    }

	public Vaisseau(String nom, int puissanceDeFeu, int nombreDePassagers) {
		this.nom = nom;
        this.nombreDePassagers = nombreDePassagers;
        this.puissanceDeFeu = puissanceDeFeu;
	}

	public String getNom() {
		return this.nom;
	}

	public int getNombrePassagers() {
		return this.nombreDePassagers;
	}

    public int getPuissance() {
        return this.puissanceDeFeu;
    }

	public boolean transportePassagers() {
        return this.nombreDePassagers > 0;
	}

}
