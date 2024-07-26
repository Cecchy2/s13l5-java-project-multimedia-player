package entities;

import interfaces.BrightnessAdjust;

public class Immagine extends MultimediaElement implements BrightnessAdjust {
    private int luminosita;


    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public void show() {
        System.out.println(titolo + "*".repeat(luminosita));
    }


    @Override
    public void aumentaLuminosita() {
        if (luminosita < 5) {
            luminosita++;
        }

    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        }

    }
}
