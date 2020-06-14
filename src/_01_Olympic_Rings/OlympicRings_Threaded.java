package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		new OlympicRings_Threaded().begin();
	}
	
	public void begin() {
		Robot ra = new Robot(500, 500);
		Robot rb = new Robot(600, 500);
		Robot rc = new Robot(700, 500);
		Robot rd = new Robot(550, 600);
		Robot re = new Robot(650, 600);
		
		ra.setSpeed(20);
		rb.setSpeed(20);
		rc.setSpeed(20);
		rd.setSpeed(20);
		re.setSpeed(20);
	}
}

