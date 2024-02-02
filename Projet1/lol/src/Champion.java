public class Champion {

    private String nom;
    private int pointsDeVie;
    private int attaque;
    private int soin;

    public Champion(String nom, int pointsDeVie, int attaque, int soin){
        this.nom = nom;
        this.pointsDeVie = pointsDeVie;
        this.attaque = attaque;
        this.soin = soin;
    }

    public String getNom() {
        return this.nom;
    }

    public int getPointsDeVie() {
        return this.pointsDeVie;
    }

    public int getAttaque() {
        return this.attaque;
    }

    public int getSoin() {
        return this.soin;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public void setSoin(int soin) {
        this.soin = soin;
    }

    public void combat(Champion champion) {
        this.setPointsDeVie(this.getPointsDeVie() - champion.getAttaque());
        champion.setPointsDeVie(champion.getPointsDeVie() - this.getAttaque());
    }

    public void boitUnePotionDeSoin() {
        this.pointsDeVie = this.pointsDeVie + 5;
    }

    public boolean estEnVie() {
        return this.pointsDeVie > 0;
    }

    public void soigne(Champion champion) {
        champion.pointsDeVie = champion.pointsDeVie + this.soin;
    }

    @Override
    public String toString(){
        return this.nom+" pv="+this.pointsDeVie+", att="+this.attaque+", soin="+this.soin;
    }
}
