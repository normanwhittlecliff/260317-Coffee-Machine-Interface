package com.normanwhittlecliff.cmi.game;

import java.awt.Color;
import java.awt.Graphics;

import com.normanwhittlecliff.coffeeLib.core.GameConfig;
import com.normanwhittlecliff.coffeeLib.core.GameLoop;
import com.normanwhittlecliff.coffeeLib.core.GameMethods;
import com.normanwhittlecliff.coffeeLib.core.GamePanel;
import com.normanwhittlecliff.coffeeLib.core.GameWindow;
import com.normanwhittlecliff.coffeeLib.core.Version;
import com.normanwhittlecliff.coffeeLib.input.Input;

public class Game implements GameMethods{
	private GameConfig gameConfig;
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private GameLoop gameLoop;
	
	//private Input input;
	
	private int rectX = 0;
	private int rectY = 0;
	private int speedX = 10;
	private int speedY = 10;

	public Game() {
		initGameConfig();
		
		// Keep this order, where the panel is created before the window.
		gamePanel = new GamePanel(this);
		gameWindow = new GameWindow(this);
		
		gameLoop = new GameLoop(this);
		gameLoop.start();
	}
	
	@Override
	public void update() {
		rectX = rectX + speedX;
		rectY = rectY + speedY;
		
		if (rectX > gameConfig.getWidth() || rectX < 0) {
			speedX *= -1;
		}
		
		if (rectY > gameConfig.getHeight() || rectY < 0) {
			speedY *= -1;
		}
	}
	
	@Override
	public void render(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(rectX, rectY, 200, 200);
	}

	private void initGameConfig() {
		gameConfig = new GameConfig();
		
		gameConfig.setBaseWidth(640);
		gameConfig.setBaseHeight(360);
		gameConfig.setScale(2);
		gameConfig.calculateSize();
		
		gameConfig.setTitle("Coffee-Machine Interface");
		gameConfig.setVersion(new Version(0, 1, 0, "Pre-Alpha"));
	}
	
	// SETTER & GETTERS
	public GameConfig getGameConfig() {
		return gameConfig;
	}
	public void setGameConfig(GameConfig gameConfig) {
		this.gameConfig = gameConfig;
	}

	public GameWindow getGameWindow() {
		return gameWindow;
	}
	public void setGameWindow(GameWindow gameWindow) {
		this.gameWindow = gameWindow;
	}

	public GamePanel getGamePanel() {
		return gamePanel;
	}
	public void setGamePanel(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}
	
}
