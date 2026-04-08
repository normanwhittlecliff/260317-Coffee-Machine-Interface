package com.normanwhittlecliff.coffeeLib.core;

import com.normanwhittlecliff.cmi.game.Game;
import com.normanwhittlecliff.coffeeLib.util.Debug;

public class GameLoop implements Runnable {
	
	private GameCore game;
	private Thread gameThread;
	
	private boolean running = false;
	
	public GameLoop(GameCore game) {
		Debug.println("GameLoop > INITIALIZING....");
		this.game = game;
	}
	
	public void start() {
		Debug.println("GameLoop > STARTING....");
		gameThread = new Thread(this);
		running = true;
		gameThread.start();
	}
	
	// GAME LOOP
	/**
     * <html>
     * <b>Game Loop:</b> Manages the update and render cycles of the game.<br>
     * Runs indefinitely, ensuring smooth gameplay by controlling updates per second (UPS) and frames per second (FPS).
     * </html>
     */
	@Override
	public void run() {

	    final double timePerUpdate = 1_000_000_000.0 / game.getGameConfig().getTargetUPS();
	    final double timePerFrame  = 1_000_000_000.0 / game.getGameConfig().getTargetFPS();

	    long previousTime = System.nanoTime();
	    long lastCheck = System.currentTimeMillis();

	    double deltaU = 0;
	    double deltaF = 0;

	    int updates = 0;
	    int frames = 0;

	    while (true) {

	        long currentTime = System.nanoTime();
	        long elapsed = currentTime - previousTime;
	        previousTime = currentTime;

	        deltaU += elapsed / timePerUpdate;
	        deltaF += elapsed / timePerFrame;

	        // UPDATE (can run multiple times if lagging)
	        while (deltaU >= 1) {
	            game.update();
	            updates++;
	            deltaU--;
	        }

	        // RENDER (only once per loop)
	        if (deltaF >= 1) {
	            game.getGamePanel().repaint();
	            frames++;
	            deltaF--;
	        }

	        // CPU RELIEF sleep a little
	        try {
	            //Thread.sleep(1);
	        	long sleepTime = (long)((timePerFrame - deltaF * timePerFrame) / 1_000_000);
	        	if (sleepTime > 0) {
	        	    Thread.sleep(sleepTime);
	        	}
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Debug output
	        if (Debug.debugMode && System.currentTimeMillis() - lastCheck >= 1000) {
	            lastCheck += 1000;
	            //System.out.println("FPS: " + frames + " | UPS: " + updates);
	            game.getGameWindow().setTitle(game.getGameConfig().getWindowTitle() 
	            		+ " | UPS: " + updates
	            		+ " | FPS: " + frames);
	            frames = 0;
	            updates = 0;
	        }
	    }
	}

}
