package arrays;


import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	public static void main (String args[]) {
		int num_of_rob = 8;
		Robot[] array = new Robot[num_of_rob];
		Random ran = new Random();
		int rand = ran.nextInt(50);
		for (int i =0; i<num_of_rob; i++) {
			array[i] = new Robot();
			array[i].setSpeed(10);
			array[i].show();
			array[i].setX((i*100)+100);
			array[i].setY(550);
		}
		int y0 = array[0].getY();
		int y1 = array[1].getY();
		int y2 = array[2].getY();
		int y3 = array[3].getY();
		int y4 = array[4].getY();
		int y5 = array[5].getY();
		int y6 = array[6].getY();
		int y7 = array[7].getY();
		while(true) {
			for (int j = 0;j<num_of_rob;j++) {
				y0 = array[0].getY();
				y1 = array[1].getY();
				y2 = array[2].getY();
				y3 = array[3].getY();
				y4 = array[4].getY();
				y5 = array[5].getY();
				y6 = array[6].getY();
				y7 = array[7].getY();
				array[j].move(rand);
				rand= ran.nextInt(100);
			}
			if(y0<=50) {
				System.out.println("Robot 1 won!");
				break;
			}
			if(y1<=50) {
				System.out.println("Robot 2 won!");
				break;
			}
			if(y2<=50) {
				System.out.println("Robot 3 won!");
				break;
			}
			if(y3<=50) {
				System.out.println("Robot 4 won!");
				break;
			}
			if(y4<=50) {
				System.out.println("Robot 5 won!");
				break;
			}
			if(y5<=50) {
				System.out.println("Robot 6 won!");
				break;
			}
			if(y6<=50) {
				System.out.println("Robot 6 won!");
				break;
			}
			if(y7<=50) {
				System.out.println("Robot 6 won!");
				break;
			}
		}
		
	}
	//1. make a main method

	//2. create an array of 5 robots.

	//3. use a for loop to initialize the robots.

		//4. make each robot start at the bottom of the screen, side by side, facing up

	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.

	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}
