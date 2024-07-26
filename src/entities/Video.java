package entities;

import interfaces.BrightnessAdjust;
import interfaces.ReproducibleElement;

public class Video extends MultimediaElement implements ReproducibleElement, BrightnessAdjust {
    private int luminosita;
    private int volume;
    private int durata;

    public Video(String titolo, int luminosita, int volume, int durata) {
        super(titolo);
        this.luminosita = luminosita;
        this.volume = volume;
        this.durata = durata;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume) + "*".repeat(luminosita));

        }
    }

    @Override
    public void alzaVolume() {
        if (volume < 5) {
            volume++;
        } else {
            System.out.println("Il volume è al massimo");
        }
    }

    @Override
    public void abbassaVolume() {
        if (volume > 0) {
            volume--;
        } else {
            System.out.println("Il volume è al minimo");
        }
    }

    @Override
    public void aumentaLuminosita() {
        if (luminosita < 5) {
            luminosita++;
        } else {
            System.out.println("La luminosità è al massimo");
        }
    }

    @Override
    public void diminuisciLuminosita() {
        if (luminosita > 0) {
            luminosita--;
        } else {
            System.out.println("La luminosità è al minimo");
        }
    }
}
