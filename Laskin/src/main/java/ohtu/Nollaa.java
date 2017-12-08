package ohtu;

import javax.swing.*;

public class Nollaa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField tuloskentta;
    private JTextField syotekentta;
    private int vanhaTulos;

    public Nollaa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovelluslogiikka;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
    }

    @Override
    public void suorita() {
        vanhaTulos = sovelluslogiikka.tulos();
        sovelluslogiikka.nollaa();
        tuloskentta.setText("" + sovelluslogiikka.tulos());
        syotekentta.setText("");
    }

    @Override
    public void peru() {
        sovelluslogiikka.plus(vanhaTulos);
        tuloskentta.setText("" + sovelluslogiikka.tulos());
        syotekentta.setText("");
    }
}
