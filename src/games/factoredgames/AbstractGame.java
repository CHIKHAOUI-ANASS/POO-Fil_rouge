package games.factoredgames;

public abstract class  AbstractGame {
	
	protected String player1;
	protected String player2;
	protected String CurrentPlayer;
	
	public AbstractGame(String Player1,String Player2){
		this.player1 = Player1;
		this.player2 = Player2;
		this.CurrentPlayer = player1;
	}
		
	protected abstract void doExecute(int coup);
		
	public void execute(int coup){
		doExecute(coup);
		if (CurrentPlayer.equals(player1)) {
			CurrentPlayer = player2;
		} else {
			CurrentPlayer = player1;
		}
	}
	
	public String getCurrentPlayer(){
		return CurrentPlayer;
	}
}
	
