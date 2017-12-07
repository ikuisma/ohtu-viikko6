package ohtu;

import javax.swing.*;

public class Nollaa extends Komento {

    private Sovelluslogiikka sovelluslogiikka;

    public Nollaa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        super(tuloskentta, syotekentta);
        this.sovelluslogiikka = sovelluslogiikka;
    }

    @Override
    public int operoi(int syote) {
        sovelluslogiikka.nollaa();
        return sovelluslogiikka.tulos();
    }
}
