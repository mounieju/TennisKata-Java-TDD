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

	private void testScoreAtBegining(TennisGame tennisGame)
	{
		Assert.assertEquals(tennisGame.getScore(),TennisGame.LOVE_ALL);
	}

}
