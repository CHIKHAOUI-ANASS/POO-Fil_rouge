package games.genericgames;

import java.util.ArrayList;

public class TicTacToeWithHints extends TicTacToe {
	
	public TicTacToeWithHints (String j1, String j2){
			super(j1 , j2);
		}
	
	public ArrayList<Integer> hints(){
			ArrayList<Integer> res = new ArrayList<>();
			if (isOver()){
					return res;
				}
			
			String opponent;
			if (currentPlayer.equals(player1)){
				opponent = player2;
			}else{
				opponent = player1;
			}
			
			for (int r = 0 ; r < 3 ; r++){
				for (int c = 0 ; c < 3 ; c++){
						if (board[r][c] == null){
								board[r][c] = opponent;
								if (opponent.equals(getWinner())){
										res.add(3*r+c);
									}
								board[r][c] = null;
							}
					}
				}
			return res;
		}

	@Override
	public String situationToString() {
		String res = super.situationToString();     // 1. la grille, comme dans TicTacToe
		ArrayList<Integer> threats = hints();       // 2. les menaces du joueur courant
		if (threats.isEmpty()) {
			res += "Aucune menace";                 // 3a. rien à signaler
		} else {
			res += "Menaces (cases où l'adversaire gagnerait) :";
			for (int move : threats) {
				res += " (" + move / 3 + "," + move % 3 + ")";   // 3b. on décode chaque nombre
			}
		}
		return res + System.lineSeparator();
	}

}
