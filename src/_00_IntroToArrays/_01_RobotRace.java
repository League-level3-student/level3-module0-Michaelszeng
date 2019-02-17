package _00_IntroToArrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {
		int x = 16;
		Robot[] robs = new Robot[x];
		// 2. create an array of 5 robots.

		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();

			// 4. make each robot start at the bottom of the screen, side by side, facing up
			robs[i].setY(550);
			robs[i].setX((525 / (x + 1)) + (1050 / (x + 1)) * i);
			robs[i].setSpeed(10);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean notWon = true;
		while (notWon == true) {
			for (Robot rob : robs) {
				int ranDist = 0;
				if (notWon == true) {
					Random ran = new Random();
					ranDist = ran.nextInt(50);
				}
				rob.move(ranDist);
				if (rob.getY() <= 75) {
					rob.turn(360);
					notWon = false;
				}
			}
		}

		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}

}
