package Studio_Class_Design;

public class BaseballPlayer {

	//Fields:playername - String, jerseynumber - int, bats(R,L, or both) - String	
	private String playername;
	private int jerseynumber;
	private String bats;
	
	// Behaviors:

	//React when a player completes a game
	//Record how many hits and RBI's earned in game
	//Total all runs and RBI's over all games played
	//Total number of games played
	
	public BaseballPlayer(String playername, int jerseynumber, String bats)
	{
		this.playername = playername;
		this.jerseynumber = jerseynumber;
		this.bats = bats;
	}
	
	public String getplayername()
	{
		return this.playername;
	}
	
	public int getjerseynumber()
	{
		return this.jerseynumber;
	}
	
	public String getbats()
	{
		return this.bats;
	}
	
	public String toString()
	{
		return "Player name: " + this.playername + " Jersey Number: " + this.jerseynumber + " Bats: " + this.bats;
	}
	
	public static void main(String args[])
	{
		BaseballPlayer myBaseballPlayer = new BaseballPlayer("Carp", 13, "B");
		System.out.println(myBaseballPlayer.getplayername());
	}		
}
