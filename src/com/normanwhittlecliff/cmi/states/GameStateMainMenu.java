package com.normanwhittlecliff.cmi.states;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import com.normanwhittlecliff.cmi.game.Game;
import com.normanwhittlecliff.coffeeLib.core.GameCore;
import com.normanwhittlecliff.coffeeLib.input.Input;
import com.normanwhittlecliff.coffeeLib.state.GameState;

public class GameStateMainMenu extends GameState{

	public GameStateMainMenu(GameCore game) {
		super(game);
		game.getGamePanel().setBackground(Color.PINK);
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.CYAN);
		g.drawRect(0, 0, 200, 200);
	}

	@Override
	public void inputs() {
		if (Input.isKeyPressed(KeyEvent.VK_ENTER)) {
			changeGameState(new GameStateTesting(game));
		}
	}

}
