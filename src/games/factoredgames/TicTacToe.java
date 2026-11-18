package games.factoredgames;

/** Une partie de morpion à deux joueurs sur une grille 3 x 3. */
public class TicTacToe extends AbstractGame {
	
    private String[][] board;   // board[rangée][colonne] : nom du joueur, ou null si la case est vide

    /** Crée une partie : j1 joue en premier. */
    public TicTacToe(String j1, String j2) {
        super(j1,j2);
        this.board = new String[3][3];
    }
    
    /** Joue le coup (rangée, colonne), supposé valide, puis passe la main à l'autre joueur. */
	@Override
	protected void doExecute(int coup){
		int row = coup / 3;
		int column = coup % 3;
		board[row][column] = CurrentPlayer;
	}
		
	/** Un coup est valide si la case existe et si elle est encore vide. */
	public boolean isValid(int coup) {
		if( coup < 0 || coup > 8 ){
			return false;
			}
		int row = coup / 3;
		int column = coup % 3;
		return board[row][column] == null;
	}

	/**
	 * Teste si les trois cases (row, column), (row + deltaRow, column + deltaColumn)
	 * et (row + 2 * deltaRow, column + 2 * deltaColumn) appartiennent toutes à player.
	 */
	public boolean wins(String player, int row, int column, int deltaRow, int deltaColumn) {
		for (int i = 0; i < 3; i++) {
			if (!player.equals(board[row + i * deltaRow][column + i * deltaColumn])) {
				return false;
			}
		}
		return true;
	}
	
	/** Retourne le gagnant, ou null (partie en cours ou match nul). */
	public String getWinner() {
		String[] players = {player1, player2};
		for (String p : players) {
			for (int i = 0; i < 3; i++) {
				if (wins(p, i, 0, 0, 1)          // la rangée i
						|| wins(p, 0, i, 1, 0)) {      // la colonne i
					return p;
				}
			}
			if (wins(p, 0, 0, 1, 1)              // diagonale descendante
					|| wins(p, 0, 2, 1, -1)) {         // diagonale montante
				return p;
			}
		}
		return null;
	}
	
	/** La partie est finie s'il y a un gagnant ou si la grille est pleine. */
	public boolean isOver() {
		if (getWinner() != null) {
			return true;                 // quelqu'un a gagné
		}
		for (int r = 0; r < 3; r++) {
			for (int c = 0; c < 3; c++) {
				if (board[r][c] == null) {
					return false;        // il reste une case vide : la partie continue
				}
			}
		}
		return true;                     // grille pleine sans gagnant : match nul
	}
	
	/** Représentation de la grille, avec les numéros de rangées et de colonnes. */
	public String situationToString() {
		String res = "  0 1 2" + System.lineSeparator();
		for (int r = 0; r < 3; r++) {
			res += r;
			for (int c = 0; c < 3; c++) {
				res += " " + symbol(board[r][c]);
			}
			res += System.lineSeparator();
		}
		return res;
	}

	/** « . » pour une case vide, « X » pour le joueur 1, « O » pour le joueur 2. */
	private String symbol(String player) {
		if (player == null) {
			return ".";
		}
		if (player.equals(player1)) {
			return "X";
		}
		return "O";
	}
}
