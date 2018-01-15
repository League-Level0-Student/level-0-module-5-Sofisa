
import java.awt.Color;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Robot bob = new Robot();
		// 2. Set the speed to 100
		bob.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "hello", "title", JOptionPane.INFORMATION_MESSAGE,
				JOptionPane.DEFAULT_OPTION, null, new String[] { "Red", "Yellow" }, 0);
		System.out.println(colorChoice);
		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		if (colorChoice == 0) {
			bob.setPenColor(Color.red);
		} else {
			bob.setPenColor(Color.yellow);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String polygon = JOptionPane.showInputDialog("How many polygons do you want to be drawn?? ");
		int polygons = Integer.parseInt(polygon);
		// 5. Use the robot to draw the number of polygons the user requested. Hint:
		// this may require a nested for loop
		bob.penDown();
		bob.hide();
		for (int j = polygons; j > 0; j--) {
			for (int i = 0; i <= 3; i++) {
				bob.move(20);
				bob.turn(90);
			}
			bob.penUp();
				bob.move(50);
				bob.turn(360/polygons);
				bob.move(75);
			
			bob.penDown();
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}
}
