import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InterfacciaGrafica extends JFrame{

    public InterfacciaGrafica (){
        setTitle("WORDLE"); // Titolo del pannello
        setSize(500, 600); // Dimensione del pannello
        setLocationRelativeTo(null); // Posiziona il pannello al centro

        //Tastiera
        Tastiera t = new Tastiera();
        creaTastiera(t);
    }

    private void creaTastiera(Tastiera t) {
        JPanel pannello = new JPanel();
        getContentPane().add(pannello); //Aggiunge il pannello sul fondo del JFrame
        pannello.setLayout(null);
        JButton tmp;
        int x = 40, y = 300;

       // for(int i=0; i<t.getLength(); i++){
            tmp = new JButton(String.valueOf(t.getChar(0)));
            tmp.setBounds(x, y, 50, 50);
            pannello.add(tmp);
       // }
        /*tmp.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });*/

    }

    public static void main (String [] args){
        InterfacciaGrafica ex = new InterfacciaGrafica();
        ex.setVisible(true); // Permette di vedere il pannello
    }
}
