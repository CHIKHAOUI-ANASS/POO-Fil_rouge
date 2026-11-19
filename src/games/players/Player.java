package games.players;

import games.genericgames.Game;

/** Un joueur : l'arbitre lui demande quel coup il veut jouer. */
public interface Player {
    /** Retourne le coup choisi par le joueur dans la situation donnée. */
    int chooseMove(Game game);
}
