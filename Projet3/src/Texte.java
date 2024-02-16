public class Texte {
    
    private String chaine;

    public Texte(String chaine) {
        this.chaine = chaine;
    }

    @Override
    public String toString() {
        return this.chaine;
    }

    public String toMorse() {
        String res = "";
        for(int i = 0; i<this.chaine.length()-1;i++){
            Lettre l = new Lettre(this.chaine.charAt(i));
            res += l.toMorse()+"___";
        }
        Lettre l = new Lettre(this.chaine.charAt(this.chaine.length()-1));
        res += l.toMorse();
        return res;
    }

    public boolean contient(Lettre l) {
        return this.chaine.contains(String.valueOf(l.toChar()));
    }

    public String decode(String textMorse) {
        String res = "";
        for(String mot : textMorse.split("_______")){
            for(String lettre : mot.split("___")){
                Lettre l = new Lettre(lettre);
                res += l.toString();
            }
            res += " ";
        }
        return res;
    }
}
