package com.normanwhittlecliff.coffeeLib.state;

import java.awt.Color;
import com.normanwhittlecliff.coffeeLib.core.GameCore;

import com.normanwhittlecliff.coffeeLib.state.GameState;

public abstract class GameState implements GameStateMethods{
	
	protected GameCore game;
	
	public GameState (GameCore game) {
		this.game = game;
		init();
	}
	
	public void init() {game.getGamePanel().setBackground(Color.DARK_GRAY);};
	
	protected void changeGameState(GameState state) {
		game.getGameStateManager().setCurrentState(state);
	}
	
}
