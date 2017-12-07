package ohtu;

import javax.swing.*;

public class Summa extends Komento {

    private Sovelluslogiikka sovelluslogiikka;

    public Summa(Sovelluslogiikka sovelluslogiikka, JTextField tuloskentta, JTextField syotekentta) {
        super(tuloskentta, syotekentta);
        this.sovelluslogiikka = sovelluslogiikka;
    }

    @Override
    public int operoi(int syote) {
        sovelluslogiikka.plus(syote);
        return sovelluslogiikka.tulos();
    }

}
