/**
 * La classe TavolaDiGioco rappresenta la griglia principale del gioco che contiene i tentativi
 * del giocatore.
 * E' composta da 5 caselle orizzontali (la lunghezza della parola) e da 6 caselle
 * verticale (il numero di tentativi possibili).
 * <p>
 * Questa classe contiene solo i tentativi del giocatore, NON sa quale sia la parola nascosta
 * NON controlla nulla
 */
public class TavolaDiGioco {
    private String [] gameboard;
    private int cont; //Contatore delle parole

    public TavolaDiGioco(){
        gameboard = new String[6];
    }

    public void addWord(String word){
        gameboard[cont] = word;
        cont++;
    }
}
