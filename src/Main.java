import entities.AudioRecording;
import entities.Immagine;
import entities.MultimediaElement;
import entities.Video;
import interfaces.ReproducibleElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MultimediaElement[] multimedia = new MultimediaElement[5];

        for (int i = 0; i < multimedia.length; i++) {
            System.out.println("Che tipo di multimedia vuoi creare? Audio / Video / immagine");
            String tipoMultimedia = scanner.nextLine().toLowerCase();

            switch (tipoMultimedia) {
                case "audio":
                    System.out.println("Inserisci il titolo");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("inserisci durata (da 1 a 5)");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci il volume(da 1 a 5)");
                    int volume = Integer.parseInt(scanner.nextLine());
                    AudioRecording audio1 = new AudioRecording(titoloAudio, durata, volume);
                    audio1.play();
                    break;
                case "video":
                    System.out.println("Inserisci il titolo");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la luminosità (da 1 a 5)");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci il volume(da 1 a 5)");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci durata (da 1 a 5)");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    Video video = new Video(titoloVideo, luminositaVideo, volumeVideo, durataVideo);
                    break;

                case "immagine":
                    System.out.println("Inserisci titolo");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("inserisci luminosità (da 1 a 5)");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    Immagine immagine = new Immagine(titoloImmagine, luminositaImmagine);
                    break;
                default:
                    System.out.println("Errore nella creazione del file");
                    break;
            }
        }

        while (true) {
            System.out.println("Scegli un elemento da riprodurre (da 1 a 5), 0 per finire");
            int sceltaFile = Integer.parseInt(scanner.nextLine());

            if (sceltaFile == 0) {
                break;
            }
            MultimediaElement sceltaMultimedia = multimedia[sceltaFile - 1];
            if (sceltaMultimedia instanceof ReproducibleElement) {
                ((ReproducibleElement) sceltaMultimedia).play();
            } else if (sceltaMultimedia instanceof Immagine) {
                ((Immagine) sceltaMultimedia).show();
            }
        }
    }
}