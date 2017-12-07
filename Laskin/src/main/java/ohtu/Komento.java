package ohtu;

import javax.swing.*;

public abstract class Komento {

    private JTextField tuloskentta;
    private JTextField syotekentta;

    public Komento(JTextField tuloskentta, JTextField syotekentta) {
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    abstract int operoi(int syote);

    public void suorita() {
        int syote = Integer.parseInt(syotekentta.getText());
        tuloskentta.setText("" + operoi(syote));
        syotekentta.setText("");
    }

    public void peru() {

    }

}
