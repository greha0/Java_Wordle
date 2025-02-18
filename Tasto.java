/**
 * Rappresentazione di un tasto della tastiera
 */
public class Tasto {
    char lett; //Lettera del tasto
    String colore; //Colore del tasto

    public Tasto(char lett){
        this.lett = lett;
        colore = "grigio";
    }

    /**
     * Cambia la lettera del tasto corrente
     * @param a Lettera
     */
    public void setLett(char a){
        lett = a;
    }

    /**
     * Cambia il colore del tasto corrente
     * @param c Colore
     */
    public void setColore(String c){
        colore = c;
    }

    /**
     * Returna il valore della lettera del tasto corrente
     * @return Lettera del tasto
     */
    public char getLett(){
        return lett;
    }

    /**
     * Returna il valore del colore del tasto corrente
     * @return Colore del tasto
     */

    public String getColore(){
        return colore;
    }

}
