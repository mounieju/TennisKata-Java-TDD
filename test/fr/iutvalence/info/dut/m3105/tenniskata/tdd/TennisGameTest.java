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
	public void testScoreIs15_0WhenServerScores()
	{
		TennisGame tennisGame = new TennisGame();
		tennisGame.serverScores();
		Assert.assertEquals(tennisGame.getScore(),"fifteen-love");
		
	}

	private void testScoreAtBegining(TennisGame tennisGame)
	{
		Assert.assertEquals(tennisGame.getScore(),TennisGame.LOVE_ALL);
	}

}
 