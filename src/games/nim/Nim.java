package games.nim;

/**
 * Une partie de jeu de Nim à deux joueurs : à tour de rôle, chaque joueur
 * retire entre 1 et k allumettes du tas ; celui qui retire la dernière perd.
 */
public class Nim {
    private int initialNbMatches;
    private int maxNbMatches;
    private String player1;
    private String player2;
    private int currentNbMatches;
    private String currentPlayer;

    /** Crée une partie : n allumettes, k retirables au maximum par coup. */
    public Nim(int n, int k, String j1, String j2) {
        this.initialNbMatches = n;
        this.maxNbMatches = k;
        this.player1 = j1;
        this.player2 = j2;
        this.currentNbMatches = n;
        this.currentPlayer = j1;
    }

    public int getInitialNbMatches() {
        return initialNbMatches;
    }

    public int getCurrentNbMatches() {
        return currentNbMatches;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    /** Décrit la situation courante : le nombre d'allumettes restantes. */
    public String situationToString() {
        return "Il reste " + currentNbMatches + " allumettes";
    }

    /** Retire des allumettes (coup supposé valide) puis passe la main à l'autre joueur. */
    public void removeMatches(int nbMatches) {
        currentNbMatches -= nbMatches;
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    /** Un coup est valide s'il est entre 1 et k, et ne dépasse pas le tas. */
    public boolean isValid(int nbMatches) {
        return nbMatches > 0 && nbMatches <= maxNbMatches && nbMatches <= currentNbMatches;
    }

    /** La partie est finie quand il ne reste plus d'allumettes. */
    public boolean isOver() {
        return currentNbMatches == 0;
    }

    /** Retourne le gagnant, ou null si la partie n'est pas finie. */
    public String getWinner() {
        if (!isOver()) {
            return null;
        }
        // Celui qui retire la dernière allumette perd. removeMatches a déjà
        // passé la main à l'autre joueur : le joueur courant est donc le gagnant.
        return currentPlayer;
    }
}
