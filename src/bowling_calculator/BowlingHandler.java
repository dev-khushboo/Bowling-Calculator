package bowling_calculator;

public class BowlingHandler {



	public static void main(String args[]) {

		BowlingGame game = new BowlingGame();

		System.out.println(game.getScore());
		System.out.println(game.isFinished());

		    game.throwBall(10);
	        game.throwBall(9);
	        game.throwBall(1);
	        game.throwBall(5);
	        game.throwBall(5);
	        game.throwBall(7);
	        game.throwBall(2);
	        game.throwBall(10);
	        game.throwBall(10);
	        game.throwBall(10);
	        game.throwBall(9);
	        game.throwBall(0);
	        game.throwBall(8);
	        game.throwBall(2);
	        game.throwBall(9);
	        game.throwBall(1);
	        game.throwBall(10);
	        game.throwBall(7);

		System.out.println(game.getScore());
		System.out.println(game.isFinished());

		// printing Score board
		for (int i = 0; i < game.frames.length; i++) {

			System.out.print("Attempt "+ i + " - ");
			System.out.print("[" + game.frames[i].getFirstThrow() + " , ");

			if (game.frames[i].isSpare())
				System.out.print("\\");
			else if (game.frames[i].isStrike())
				System.out.print("X");
			else
				System.out.print(game.frames[i].getSecondThrow());

			System.out.print("] , Temp: " + game.frames[i].getTemp());
			System.out.print(", Points: " + game.frames[i].getPoints());
			System.out.println();
		}
	}


}
