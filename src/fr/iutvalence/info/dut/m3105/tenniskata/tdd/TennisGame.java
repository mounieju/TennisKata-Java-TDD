package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	private int serverScore;

	public String getScore() 
	{
		if (this.serverScore==15)
		{
			return FIFTEEN_LOVE;
		}
		else
		{
			return LOVE_ALL;
		}
	}

	public void serverScores() 
	{	
		this.serverScore += 15;
	}


}
 