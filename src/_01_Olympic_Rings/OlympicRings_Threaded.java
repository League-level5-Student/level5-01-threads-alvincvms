package _01_Olympic_Rings;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		new OlympicRings_Threaded().begin();
	}
	
	class MyThread extends Thread{
		Robot r;
		MyThread(Robot r) {
			this.r = r;
		}
		
		@Override
		public void run() {
			for(int i = 0; i < 360; i++) {
				r.move(1);
				r.turn(1);
			}
		}
	}
	
	public void begin() {
		Robot ra = new Robot(500, 500);
		Robot rb = new Robot(600, 500);
		Robot rc = new Robot(700, 500);
		Robot rd = new Robot(550, 600);
		Robot re = new Robot(650, 600);
		
		ra.penDown();
		rb.penDown();
		rc.penDown();
		rd.penDown();
		re.penDown();
		
		Thread r1 = new MyThread(ra);
		Thread r2 = new MyThread(rb);
		Thread r3 = new MyThread(rc);
		Thread r4 = new MyThread(rd);
		Thread r5 = new MyThread(re);
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}

