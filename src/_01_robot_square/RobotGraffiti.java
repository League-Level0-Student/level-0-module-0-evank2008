package _01_robot_square;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
public static void main(String[] args) {
	Robot sans = new Robot();

sans.penDown();
sans.setSpeed(100);
sans.setPenWidth(5);
sans.turn(90);
sans.move(150);
sans.move(-150);
sans.turn(90);
sans.move(200);
sans.turn(270);
sans.move(200);
sans.turn(180);
sans.move(200);
sans.turn(90);
sans.move(400);
sans.turn(90);
sans.move(200);
}
	
}
