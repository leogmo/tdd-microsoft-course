package bowlingkata;

public class Game {
	
	private int score = 0;
	private int[] rolls = new int[21];
	private int currentRoll = 0;

	public void roll(int pins){
		rolls[currentRoll] = pins;
		currentRoll++;
	}
	
	public int scoreGame(){
		int score = 0;
		int frameIndex = 0;
		for (int frame = 0; frame < 10; frame++){
			if (rolls[frameIndex] == 10){
				score += rolls[frameIndex] + rolls[frameIndex + 1] + rolls[frameIndex + 2];
				frameIndex++;
			} else if (isSpare(frameIndex)){ //spare
				score += 10 + rolls[frameIndex +2];
				frameIndex += 2;
			} else {
				score += rolls[frameIndex] + rolls[frameIndex +1];
				frameIndex += 2;
			}			
		}
		return score;
	}
	
	public boolean isSpare(int frameIndex){
		return rolls[frameIndex] + rolls[frameIndex +1] == 10;
	}
}