package fr.iutvalence.info.dut.m3105.tenniskata.tdd;
public class TennisGame
{
	public static final String LOVE_ALL = "love-all";
	public static final String FIFTEEN_LOVE = "fifteen-love";
	public static final String LOVE_FIFTEEN = "love-fifteen";
	public static final String FIFTEEN_ALL = "fifteen-all";
	private int serverScore;
	private int receiverScore;

	public String getScore() 
	{
		if (this.serverScore==15 && this.receiverScore==0)
		{
			return FIFTEEN_LOVE;
		}
		if (this.receiverScore==15 && this.serverScore==0)
		{
			return LOVE_FIFTEEN;
		}
		if (this.receiverScore==15 && this.serverScore==15)
		{
			return FIFTEEN_ALL;
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

	public void receiverScores() 
	{
		this.receiverScore += 15;
		
	}


}
 