package ohtu;

import javax.swing.*;

public class Erotus implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int syote;

    public Erotus(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovelluslogiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        try {
            syote = Integer.parseInt(syotekentta.getText());
            sovelluslogiikka.miinus(syote);
            tuloskentta.setText("" + sovelluslogiikka.tulos());
            syotekentta.setText("");
        } catch (Exception e) {
        }
    }

    @Override
    public void peru() {
        sovelluslogiikka.plus(syote);
        tuloskentta.setText("" + sovelluslogiikka.tulos());
        syotekentta.setText("" + syote);
    }
}
