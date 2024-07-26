import entities.AudioRecording;

public class Main {
    public static void main(String[] args) {

        AudioRecording nuovaRegistrazione = new AudioRecording("Audio1", 5, 4);
        nuovaRegistrazione.alzaVolume();
        nuovaRegistrazione.abbassaVolume();
        nuovaRegistrazione.alzaVolume();
        nuovaRegistrazione.play();
        nuovaRegistrazione.abbassaVolume();
        nuovaRegistrazione.abbassaVolume();
        nuovaRegistrazione.play();
    }
}