package bowling_calculator;

public class Frame {

	private int firstThrow;
	private int secondThrow;
	private int temp;
	private int bonus;
	private int points;
	private boolean isStrike;
	private boolean isSpare;


	public Frame() {

		this.firstThrow = BowlingGame.EMPTY;
		this.secondThrow = BowlingGame.EMPTY;
		this.temp = 0;
		this.bonus = 0;
		this.points = 0;
		this.isSpare = false;
		this.isStrike = false;
	}


	public boolean isStrike() {
		return isStrike;
	}
	
	public void setStrike(boolean isStrike) {
		this.isStrike = isStrike;
	}

	public boolean isSpare() {
		return isSpare;
	}

	public void setSpare(boolean isSpare) {
		this.isSpare = isSpare;
	}

	public int getTemp() {
		return temp;
	}

	public void addToTemp(int val) {
		this.temp += val;
	}

	public int getFirstThrow() {
		return firstThrow;
	}
	
	public void setFirstThrow(int firstRoll) {
		this.firstThrow = firstRoll;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	public void setSecondThrow(int secondRoll) {
		this.secondThrow = secondRoll;
	}
	
	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public void decreaseBonus() {
		this.bonus--;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}


}
