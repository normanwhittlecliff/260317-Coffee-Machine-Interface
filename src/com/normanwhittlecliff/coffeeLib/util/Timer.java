package com.normanwhittlecliff.coffeeLib.util;


/**
 * A simple update-based timer that tracks the passage of time using update cycles.
 *
 * <p>This timer is designed for game loops or systems where time is measured
 * in "ticks" or frames rather than real-world time. Each call to {@link #update()}
 * increments an internal counter until it reaches the specified duration.</p>
 *
 * <p>Once the counter reaches or exceeds the duration, the timer is marked as finished.
 * The timer will stop incrementing until it is reset.</p>
 * 
 * @author Norman Whittlecliff
 * @version 1.0.0 (2026-04-02)
 */
public class Timer {

	// Times of updates per second in a given system/game. It is 60 by default. 
    private static int targetUPS;
	
	// Total number of update cycles required for the timer to finish
    private int duration;
    
    // Current number of elapsed update cycles
    private int counter;

    // Indicates whether the timer has completed its duration
    private boolean finished;

    /**
     * Creates a new Timer with a specified duration. The Duration is for number of updates, 
     * so if the system takes 60 updates per second, a duration of 60 will, thus, be finished in one second.
     *
     * @param duration the number of update cycles required for the timer to complete.
     */
    public Timer(int duration) {
        this.duration = duration;
        this.counter = 0;
        this.finished = false;
    }
    
    
    /**
     * Updates the timer by incrementing its internal counter.
     *
     * <p>If the timer has not yet finished, the counter is increased by one.
     * Once the counter reaches or exceeds the duration, the timer is marked as finished.</p>
     *
     * <p>This method is typically called once per frame or game loop iteration.</p>
     */
    public void update() {
        if (!finished) {
            counter++;
            if (counter >= duration) {
                finished = true;
            }
        }
    }
    
    /**
     * Resets the timer to its initial state.
     *
     * <p>This sets the counter back to zero and marks the timer as not finished,
     * allowing it to be reused.</p>
     */
    public void reset() {
        counter = 0;
        finished = false;
    }
    
    // =========================
 	// GETTERS & SETTERS
 	// =========================
	public static int getTargetUPS() {return targetUPS;}
	public static void setTargetUPS(int targetUPS) {Timer.targetUPS = targetUPS;}

	public int getDuration() {return duration;}
	public void setDuration(int duration) {this.duration = duration;}
	
	public int getCounter() {return counter;}
	public void setCounter(int counter) {this.counter = counter;}
	
	public boolean isFinished() {return finished;}
	public void setFinished(boolean finished) {this.finished = finished;}
}
