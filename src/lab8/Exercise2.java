/**
 * Write a thread program to display timer where timer will get refresh after every 10seconds
 */
package lab8;

import java.util.*;

public class Exercise2 {
	public static void main(String[] args) {
		Task t1 = new Task("Task 1");
		Timer t = new Timer();
		// schedule() methods to schedule a task to run once at given date or after some
		// delay.
		t.schedule(t1, 10000); // executes for every 10 seconds
	}
}

//The Timer class schedules a task to run at a given time once or repeatedly
class Task extends TimerTask {
	private String name;

	public Task(String name) {
		this.name = name;
	}

	public void run() {
		System.out.println("[" + new Date() + "] " + name + ": task executed!");
	}
}
