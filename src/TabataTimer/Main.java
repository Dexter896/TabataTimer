package TabataTimer;

import java.util.Timer;
import java.util.TimerTask;

public class Main {

	public static void main(String[] args) {
		timer();

	}
	

	public static  void timer() {
		int time1 = 20000; 
		int time2 = 10000;
		
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {
			@Override
			public void run() {
				System.out.print("Work Time");
			}
		};
		
		
		timer.schedule(task, time1); // runs the task After the delay
	}
}
