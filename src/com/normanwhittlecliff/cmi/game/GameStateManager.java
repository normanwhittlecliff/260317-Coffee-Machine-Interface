package com.normanwhittlecliff.cmi.game;

import java.awt.Graphics;

import com.normanwhittlecliff.cmi.states.GameStateIntroSoftware;
import com.normanwhittlecliff.coffeeLib.core.GameCore;
import com.normanwhittlecliff.coffeeLib.state.GameState;
import com.normanwhittlecliff.coffeeLib.util.Debug;

public class GameStateManager {
	
	private GameCore game;
	private GameState currentState;
	
	public GameStateManager(GameCore game) {
		Debug.println("GameStateManager > INITIALIZING...");
		this.game = game;
		this.currentState = new GameStateIntroSoftware(game);
	}
	
	public void update() {
		currentState.update();
		currentState.inputs();
	}
	
	public void render (Graphics g) {
		currentState.render(g);
	}

	public GameCore getGame() {
		return game;
	}

	public void setGame(GameCore game) {
		this.game = game;
	}

	public GameState getCurrentState() {
		return currentState;
	}

	public void setCurrentState(GameState currentState) {
		this.currentState = currentState;
	}
	
	
	
}
