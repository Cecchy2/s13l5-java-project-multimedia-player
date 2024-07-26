package entities;

import interfaces.BrightnessAdjust;

public class Immagine extends MultimediaElement implements BrightnessAdjust {
    public Immagine(String titolo) {
        super(titolo);
    }

    @Override
    public void umentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }
}
