package com.normanwhittlecliff.coffeeLib.core;

import java.awt.Graphics;

import com.normanwhittlecliff.cmi.game.GameStateManager;
import com.normanwhittlecliff.coffeeLib.input.Input;
import com.normanwhittlecliff.coffeeLib.util.Debug;

public class GameCore implements GameMethods{

	// =========================
	// ESSENCIALS
	// =========================
	
	private GameConfig gameConfig;
	private GameWindow gameWindow;
	private GamePanel gamePanel;
	private GameLoop gameLoop;
	private GameStateManager gameStateManager;
	private Input input;
		
	public GameCore() {
		
	}
	
	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	
	// =========================
	// PRIVATE METHODS
	// =========================
	
	protected void initialize() {
		initGameConfig();
		initWindowAndPanel();
		
		gameStateManager = new GameStateManager(this);
		
		initGameLoop();
	}
	
	/**
	 * Initializes and starts the game loop.
	 */
	protected void initGameLoop() {
		gameLoop = new GameLoop(this);
		gameLoop.start();
	}
	
	/**
	 * Initializes the input, the Panel (where the game takes places) and and window of the game. It is very important
	 * the panel is created after the 
	 */
	protected void initWindowAndPanel() {
		// Keep this order, where the panel is created before the window.
		
		input = new Input();
		
		gamePanel = new GamePanel(this);
		gamePanel.addKeyListener(input);
		gamePanel.addMouseListener(input);
		gamePanel.addMouseMotionListener(input);
		gamePanel.setFocusable(true);
		
		gameWindow = new GameWindow(this);
		
		gamePanel.requestFocus();
	}
	
	protected void initGameConfig() {
		gameConfig = new GameConfig();
		
		gameConfig.setBaseWidth(640);
		gameConfig.setBaseHeight(360);
		gameConfig.setTargetUPS(60);
		gameConfig.setTargetUPS(60);
		gameConfig.setScale(2);
		gameConfig.calculateSize();
		
		gameConfig.setTitle("Title");
		gameConfig.setVersion(new Version(0, 0, 0, "stage"));
		
	}

	// SETTER & GETTERS
	public GameConfig getGameConfig() {return gameConfig;}
	public void setGameConfig(GameConfig gameConfig) {this.gameConfig = gameConfig;}

	public GameWindow getGameWindow() {return gameWindow;}
	public void setGameWindow(GameWindow gameWindow) {this.gameWindow = gameWindow;}

	public GamePanel getGamePanel() {return gamePanel;}
	public void setGamePanel(GamePanel gamePanel) {this.gamePanel = gamePanel;}

	public GameLoop getGameLoop() {return gameLoop;}
	public void setGameLoop(GameLoop gameLoop) {this.gameLoop = gameLoop;}

	public Input getInput() {return input;}
	public void setInput(Input input) {this.input = input;}

	public GameStateManager getGameStateManager() {
		return gameStateManager;
	}

	public void setGameStateManager(GameStateManager gameStateManager) {
		this.gameStateManager = gameStateManager;
	}
	
	

}
