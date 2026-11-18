package games.factoredgames;

/**
 * Une partie de jeu de Nim à deux joueurs : à tour de rôle, chaque joueur
 * retire entre 1 et k allumettes du tas ; celui qui retire la dernière perd.
 */
public class Nim extends AbstractGame {
    private int initialNbMatches;
    private int maxNbMatches;
    private int currentNbMatches;

    /** Crée une partie : n allumettes, k retirables au maximum par coup. */
    public Nim(int n, int k, String j1, String j2) {
        super(j1,j2);
        this.initialNbMatches = n;
        this.maxNbMatches = k;
        this.currentNbMatches = n;
    }

    public int getInitialNbMatches() {
        return initialNbMatches;
    }

    public int getCurrentNbMatches() {
        return currentNbMatches;
    }

    /** Décrit la situation courante : le nombre d'allumettes restantes. */
    public String situationToString() {
        return "Il reste " + currentNbMatches + " allumettes";
    }

    /** Retire des allumettes (coup supposé valide) puis passe la main à l'autre joueur. */
    @Override
    protected void doExecute(int coup){
		currentNbMatches -= coup;	
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
        return CurrentPlayer;
    }
}
