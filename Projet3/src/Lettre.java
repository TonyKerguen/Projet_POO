import java.util.Arrays;
import java.util.List;

public class Lettre{
    private static List<String> alphabetMorse = Arrays.asList("=_===", 
            "===_=_=_=", "===_=_===_=", "===_=_=", "=", "=_=_===_=",
            "===_===_=", "=_=_=_=", "=_=", "=_===_===_===", "===_=_===",
            "=_===_=_=", "===_===", "===_=", "===_===_===", "=_===_===_=",
            "===_===_=_===", "=_===_=", "=_=_=", "===", "=_=_===",
            "=_=_=_===", "=_===_===", "===_=_=_===", "===_=_===_===",
            "===_===_=_=", "_");
    private static List<Character> alphabet = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 
            'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
            'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' ');

    private String morse;
    private char lettre;


    public Lettre(String morse) {
        this.morse = morse;
        this.lettre = ' ';
    }

    public Lettre(char lettre) {
        this.lettre = lettre;
        this.morse = "";
    }

    public int toNumero() {
        if(Lettre.alphabetMorse.contains(this.morse)){
            return Lettre.alphabetMorse.indexOf(this.morse);
        }
        return (int)this.lettre-65;
    }

    public char toChar() {
        return Lettre.alphabet.get(this.toNumero());
    }

    public String toMorse() {
        return Lettre.alphabetMorse.get(this.toNumero());
    }

    @Override
    public String toString(){
        return String.valueOf(this.toChar());
    }
}
