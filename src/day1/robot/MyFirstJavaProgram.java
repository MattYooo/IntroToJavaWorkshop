package day1.robot;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE
Robot amr2=new Robot();
amr2.setPenColor(Color.MAGENTA);
amr2.penDown();
for (int i = 0; i < 4; i++) {
amr2.move(50);
amr2.turn(45);
}		

		
	}
}
