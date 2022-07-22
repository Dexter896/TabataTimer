package TabataTimer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		restTimer();

	}
	

	public static void workTimer() { 
		System.out.println("Work Time");
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		final Runnable runnable = new Runnable() {
			int countdown = 20;

			public void run() {
				System.out.println(countdown);
				countdown--;
				
				if (countdown < 0) {
                    System.out.println("Timer Over!");
                    scheduler.shutdown();
                }
			}
		};
		
		scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}
	
	public static void restTimer() {
		System.out.println("Rest Time");
		
		final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		
		final Runnable runnable = new Runnable() {
			int countdown = 10;

			public void run() {
				System.out.println(countdown);
				countdown--;
				
				if (countdown < 0) {
                    System.out.println("Timer Over!");
                    scheduler.shutdown();
                }
			}
		};
		
		scheduler.scheduleAtFixedRate(runnable, 0, 1, TimeUnit.SECONDS);
	}
}
