package bowlingkata.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import bowlingkata.Game;

public class BowlingKataUnitTests {
	
	private Game g;
	
	public BowlingKataUnitTests(){
		g = new Game();
	}

	@Test
	public void DoesGameExist() {
		//arrange
		
		//act
		
		//assert
		assertNotNull(g);
	}
	
	@Test
	public void GutterGameReturns0() {
		//arrange
		
		//act
		rollMany(20, 0);
		
		//assert
		assertEquals(0, g.scoreGame());
	}

	@Test
	public void singlePinGameReturns20() {
		//arrange
		
		//act
		rollMany(20, 1);
		
		//assert
		assertEquals(20, g.scoreGame());
	}
	
	@Test
	public void oneSpareReturnsAppropriatedValue() {
		//arrange
		g.roll(5);
		g.roll(5); //spare
		g.roll(3);
		
		//act
		rollMany(17, 0);
		
		//assert
		assertEquals(16, g.scoreGame());
	}
	
	@Test
	public void oneStrikeReturnsAppropriatedValue() {
		//arrange
		g.roll(10); //strike
		g.roll(3);
		g.roll(4);
		
		//act
		rollMany(16, 0);
		
		//assert
		assertEquals(24, g.scoreGame());
	}
	
	public void rollMany(int rolls, int pins){
		for(int i = 0; i < rolls; i++){
			g.roll(pins);
		}
	}
}
