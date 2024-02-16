public class ExecutableMorse {
    public static void main( String [] args ) {
        
        // Lettre a = new Lettre('A');
        // System.out.println(a.toNumero());
        // Lettre n = new Lettre('N');
        // System.out.println(n.toChar());
        // System.out.println( n.toChar() == 'N');
        // System.out.println( n.toMorse().equals("===_="));

        // Lettre a2 = new Lettre("=_===");
        // System.out.println(a2.toNumero());
        // System.out.println( a2.toMorse().equals ("=_===")) ;
        // System.out.println( a2.toChar() == 'A');

        // //mes tests
        // Lettre t = new Lettre('T');
        // System.out.println( t.toChar() == 'T');
        // System.out.println( t.toMorse().equals("==="));

        // Lettre o = new Lettre('O');
        // System.out.println( o.toChar() == 'O');
        // System.out.println( o.toMorse().equals("===_===_==="));

        // Texte text = new Texte("TT");
        // System.out.println(text.toString());
        // System.out.println(text.toMorse());

        // System.out.println(text.contient(t));

        String textMorse = "=== _ = _ = _ = ___ = _ === _______ === _ = _ = _ = ___ = _ ===";
        System.out.println(decode(textMorse));
    }

}