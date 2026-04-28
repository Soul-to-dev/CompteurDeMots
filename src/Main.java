import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int totalMots = 0;

        int totalLignes = 0;

        try {
            File fichier = new File("texte.txt");

            Scanner lecteur = new Scanner(fichier);

            System.out.println("=== Compteur de Mots ===");
            System.out.println("Lecture du fichier : texte.txt");
            System.out.println("=======================");

            // On lit le fichier ligne par ligne
            while (lecteur.hasNextLine()) {

                String ligne = lecteur.nextLine();

                String[] mots = ligne.split(" ");

                int motsParLigne = mots.length;

                totalMots = totalMots + motsParLigne;
                totalLignes = totalLignes + 1;

                System.out.println("Ligne " + totalLignes + " : " + motsParLigne + " mots  --> " + ligne);
            }

            // On ferme le lecteur
            lecteur.close();

            System.out.println("=======================");
            System.out.println("Nombre total de lignes : " + totalLignes);
            System.out.println("Nombre total de mots : " + totalMots);

        } catch (Exception e) {
            System.out.println("Erreur : fichier introuvable !");
            System.out.println(e.getMessage());
        }
    }
}
