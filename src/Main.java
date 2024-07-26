import entities.AudioRecording;
import entities.Immagine;
import entities.MultimediaElement;
import entities.Video;
import interfaces.ReproducibleElement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Video videoProva = new Video("videoProva", 3, 4, 6);
        videoProva.alzaVolume();
        videoProva.play();
        videoProva.diminuisciLuminosita();
        videoProva.play();

        Immagine immagineProva = new Immagine("immagineProva", 3);
        immagineProva.show();
        immagineProva.aumentaLuminosita();
        immagineProva.show();

        AudioRecording audioProva = new AudioRecording("audioProva", 4, 6);
        audioProva.play();
        audioProva.abbassaVolume();
        audioProva.abbassaVolume();
        audioProva.play();

        /*----------SCANNER--------*/

        Scanner scanner = new Scanner(System.in);
        MultimediaElement[] multimedia = new MultimediaElement[5];

        for (int i = 0; i < multimedia.length; i++) {
            System.out.println("Che tipo di multimedia vuoi creare? Audio / Video / immagine");
            String tipoMultimedia = scanner.nextLine().toLowerCase();

            switch (tipoMultimedia) {
                case "audio":
                    System.out.println("Inserisci il titolo");
                    String titoloAudio = scanner.nextLine();
                    System.out.println("inserisci durata");
                    int durata = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci il volume(da 1 a 5)");
                    int volume = Integer.parseInt(scanner.nextLine());
                    multimedia[i] = new AudioRecording(titoloAudio, durata, volume);
                    break;
                case "video":
                    System.out.println("Inserisci il titolo");
                    String titoloVideo = scanner.nextLine();
                    System.out.println("Inserisci la luminosità (da 1 a 5)");
                    int luminositaVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("inserisci il volume(da 1 a 5)");
                    int volumeVideo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Inserisci durata");
                    int durataVideo = Integer.parseInt(scanner.nextLine());
                    multimedia[i] = new Video(titoloVideo, luminositaVideo, volumeVideo, durataVideo);
                    break;

                case "immagine":
                    System.out.println("Inserisci titolo");
                    String titoloImmagine = scanner.nextLine();
                    System.out.println("inserisci luminosità (da 1 a 5)");
                    int luminositaImmagine = Integer.parseInt(scanner.nextLine());
                    multimedia[i] = new Immagine(titoloImmagine, luminositaImmagine);
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
        scanner.close();
    }
}