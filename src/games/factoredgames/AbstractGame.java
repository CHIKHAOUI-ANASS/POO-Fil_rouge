package games.factoredgames;

/** Partie commune à tous les jeux à deux joueurs : les joueurs et le tour de jeu. */
public abstract class AbstractGame {
    protected String player1;
    protected String player2;
    protected String currentPlayer;

    /** Le joueur passé en premier argument joue en premier. */
    public AbstractGame(String j1, String j2) {
        this.player1 = j1;
        this.player2 = j2;
        this.currentPlayer = j1;
    }

    /** Exécute un coup sans changer le joueur courant (propre à chaque jeu). */
    protected abstract void doExecute(int move);

    /** Exécute un coup puis passe la main à l'autre joueur (identique pour tous les jeux). */
    public void execute(int move) {
        doExecute(move);
        if (currentPlayer.equals(player1)) {
            currentPlayer = player2;
        } else {
            currentPlayer = player1;
        }
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }
}
