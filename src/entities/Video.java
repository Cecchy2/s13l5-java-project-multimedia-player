package entities;

import interfaces.BrightnessAdjust;
import interfaces.ReproducibleElement;

public class Video extends MultimediaElement implements ReproducibleElement, BrightnessAdjust {
    public Video(String titolo) {
        super(titolo);
    }

    @Override
    public void play() {

    }

    @Override
    public void alzaVolume() {

    }

    @Override
    public void abbassaVolume() {

    }

    @Override
    public void umentaLuminosita() {

    }

    @Override
    public void diminuisciLuminosita() {

    }
}
