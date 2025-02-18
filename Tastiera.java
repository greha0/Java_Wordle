/**
 * Rappresentazione di una tastiera con disposizione QUERTY
 * (probabile input del gioco wordle)
 * Ancora da integrare con la grafica
 */
public class Tastiera {
    private Tasto [] keyboard;
    private char [] keyboardType; //Array di lettere con disposizione QUERTY

    public Tastiera(){
        keyboard = new Tasto[28];

        keyboardType = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','←','z','x','c','v','b','n','m','↵'};

        for(int i=0; i<28; i++){
            keyboard[i] = new Tasto(keyboardType[i]);
        }
    }
}
