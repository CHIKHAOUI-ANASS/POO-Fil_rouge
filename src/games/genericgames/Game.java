package games.genericgames;

import games.players.Player;
import java.util.List;

/** Tout ce qu'il faut savoir faire pour arbitrer une partie de jeu à deux joueurs. */
public interface Game {
    /** Le joueur à qui c'est le tour. */
    Player getCurrentPlayer();

    /** Dit si le coup est valide dans la situation courante. */
    boolean isValid(int move);

    /** Joue le coup (supposé valide) puis passe la main à l'autre joueur. */
    void execute(int move);

    /** Dit si la partie est terminée. */
    boolean isOver();

    /** Le gagnant, ou null si la partie n'est pas finie ou si c'est un match nul. */
    Player getWinner();

    /** Tous les coups valides dans la situation courante. */
    List<Integer> validMoves();

    /** Une représentation lisible d'un coup. */
    String moveToString(int move);

    /** Une représentation lisible de la situation courante. */
    String situationToString();

    /** Une nouvelle partie qui représente exactement la même situation. */
    Game copy();
}
