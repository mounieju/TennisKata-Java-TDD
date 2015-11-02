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
		testScore(tennisGame,TennisGame.LOVE_FIFTEEN);	
	}
	
	@Test
	public void testScoreWhenBothPlayersScoreAfterTheBeginningOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.receiverScores();
		tennisGame.serverScores();
		testScore(tennisGame,TennisGame.FIFTEEN_ALL);	
	}

	
	private void testScore(TennisGame tennisGame, String score) 
	{
		Assert.assertEquals(tennisGame.getScore(),score);
	}

}
 