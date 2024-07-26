package entities;

import interfaces.ReproducibleElement;

public class AudioRecording extends MultimediaElement implements ReproducibleElement {
    private int durata;
    private int volume;

    public AudioRecording(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
    }


    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            System.out.println(titolo + "!".repeat(volume));
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
    //--------------getter and setter------

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
