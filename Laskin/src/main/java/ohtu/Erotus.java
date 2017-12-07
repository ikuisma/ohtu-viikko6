package ohtu;

import javax.swing.*;

public class Erotus extends Komento {

    private Sovelluslogiikka sovelluslogiikka;

    public Erotus(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        super(tuloskentta, syotekentta);
        this.sovelluslogiikka = sovelluslogiikka;
    }

    @Override
    public int operoi(int syote) {
        sovelluslogiikka.miinus(syote);
        return sovelluslogiikka.tulos();
    }

}
