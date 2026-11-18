package games.factoredgames;

import java.util.Scanner;

/** Classe exécutable : une partie de Nim à deux joueurs, au clavier. */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom du joueur 1 : ");
        String j1 = scanner.nextLine();
        System.out.println("Nom du joueur 2 : ");
        String j2 = scanner.nextLine();

        // On redemande tant que les valeurs ne respectent pas n >= 2 et 1 <= k < n
        int n = 0;
        while (n < 2) {
            System.out.println("Nombre initial d'allumettes (au moins 2) : ");
            n = scanner.nextInt();
        }
        int k = 0;
        while (k < 1 || k >= n) {
            System.out.println("Nombre maximum à retirer (entre 1 et " + (n - 1) + ") : ");
            k = scanner.nextInt();
        }

        Nim jeu = new Nim(n, k, j1, j2);
        while (!jeu.isOver()) {
            System.out.println(jeu.situationToString());
            System.out.println("C'est le tour du joueur : " + jeu.getCurrentPlayer());
            System.out.println("Combien d'allumettes voulez-vous retirer ?");
            int nbMatches = scanner.nextInt();
            if (jeu.isValid(nbMatches)) {
                jeu.removeMatches(nbMatches);
            } else {
                System.out.println("Nombre d'allumettes invalide");
            }
        }
        System.out.println("Le gagnant est : " + jeu.getWinner());
        scanner.close();
    }
}
