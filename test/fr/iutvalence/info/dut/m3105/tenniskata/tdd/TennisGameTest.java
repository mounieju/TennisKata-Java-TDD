package fr.iutvalence.info.dut.m3105.tenniskata.tdd;


import org.junit.Assert;
import org.junit.Test;

public class TennisGameTest
{
	

	@Test
	public void testScoreIs0_0InTheBeginingOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		testScoreAtBegining(tennisGame);
	}
	
	@Test
	public void testScoreWhenServerScoresAfterTheBeginingOfTennisGame()
	{
		TennisGame tennisGame = new TennisGame();
		Assert.assertEquals(tennisGame.serverScores(),"fifteen-love");	
	}

	private void testScoreAtBegining(TennisGame tennisGame)
	{
		Assert.assertEquals(tennisGame.getScore(),TennisGame.LOVE_ALL);
	}

}
 