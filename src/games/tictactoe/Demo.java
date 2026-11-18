package games.tictactoe;

import java.util.Scanner;

/** Classe exécutable : une partie de morpion à deux joueurs, au clavier. */
public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
        System.out.println("Nom du joueur 1 (X) : ");
        String j1 = scanner.nextLine();
        String j2;
        do {
            System.out.println("Nom du joueur 2 (O), différent du joueur 1 : ");
            j2 = scanner.nextLine();
        } while (j2.equals(j1));
		
		System.out.println("Jouer avec les indices ? (oui/non) : ");
		String answer = scanner.nextLine();
		TicTacToe jeu;                               // peut contenir l'un ou l'autre
		if (answer.equals("oui")) {
			jeu = new TicTacToeWithHints(j1, j2);
		} else {
			jeu = new TicTacToe(j1, j2);
		}
		
        while (!jeu.isOver()) {
            System.out.println(jeu.situationToString());
            System.out.println("C'est à " + jeu.getCurrentPlayer() + " de jouer");
            System.out.println("Rangée ?");
            int row = scanner.nextInt();
            System.out.println("Colonne ?");
            int column = scanner.nextInt();
            if (jeu.isValid(row, column)) {
                jeu.execute(row, column);
            } else {
                System.out.println("Coup invalide");
            }
        }

        System.out.println(jeu.situationToString());
        String winner = jeu.getWinner();
        if (winner == null) {
            System.out.println("Match nul");
        } else {
            System.out.println("Le gagnant est : " + winner);
        }
        scanner.close();
    }
}
