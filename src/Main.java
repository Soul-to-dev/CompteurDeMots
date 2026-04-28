import java.io.File;
import java.util.Scanner;

// Classe principale du compteur de mots
public class Main {

    public static void main(String[] args) {

        // Le nombre total de mots dans le fichier
        int totalMots = 0;

        // Le nombre de lignes lues
        int totalLignes = 0;

        try {
            // On crée un objet File qui pointe vers notre fichier texte
            File fichier = new File("texte.txt");

            // On crée un Scanner pour lire le fichier ligne par ligne
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
            // Si le fichier n'est pas trouvé on affiche une erreur
            System.out.println("Erreur : fichier introuvable !");
            System.out.println(e.getMessage());
        }
    }
}
