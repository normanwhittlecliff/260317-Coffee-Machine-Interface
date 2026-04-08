package com.normanwhittlecliff.cmi.states;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

import com.normanwhittlecliff.cmi.game.Game;
import com.normanwhittlecliff.coffeeLib.core.GameCore;
import com.normanwhittlecliff.coffeeLib.input.Input;
import com.normanwhittlecliff.coffeeLib.state.GameState;
import com.normanwhittlecliff.coffeeLib.util.Debug;
import com.normanwhittlecliff.coffeeLib.util.Timer;

public class GameStateIntroSoftware extends GameState{
	
	Timer timer;

	public GameStateIntroSoftware(GameCore game) {
		super(game);
		Debug.println(this + " > INITIALIZING...");
		timer = new Timer(3 * 60);
		init();
	}

	@Override
	public void init() {
		game.getGamePanel().setBackground(Color.BLACK);
	}

	@Override
	public void update() {
		timer.update();
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.WHITE);
		g.drawString(
				"Developed by Norman Whittlecliff", 
				game.getGameConfig().getBaseWidth() / 2, 
				game.getGameConfig().getBaseHeight() / 2);
	}

	@Override
	public void inputs() {
		if (timer.isFinished() || Input.isKeyPressed()) {
			changeGameState(new GameStateMainMenu(game));
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "GameState Intro Software";
	}

}
