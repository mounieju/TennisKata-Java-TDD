package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	


	@Test
	public void testScoreIs0_0InTheBeginningOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		testScore(tennisGame,TennisGame.LOVE_ALL);
	}
	
	@Test
	public void testScoreWhenServerScoresAfterTheBeginningOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		testScore(tennisGame,TennisGame.FIFTEEN_LOVE);	
	}
	
	@Test
	public void testScoreWhenReceiverScoresAfterTheBeginningOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		Assert.assertEquals(tennisGame.getScore(),"love-fifteen");	
	}

	
	private void testScore(TennisGame tennisGame, String score) 
	{
		Assert.assertEquals(tennisGame.getScore(),score);
	}

}
 