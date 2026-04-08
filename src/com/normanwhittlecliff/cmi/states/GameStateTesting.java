package com.normanwhittlecliff.cmi.states;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.normanwhittlecliff.cmi.game.Game;
import com.normanwhittlecliff.coffeeLib.core.GameCore;
import com.normanwhittlecliff.coffeeLib.input.Input;
import com.normanwhittlecliff.coffeeLib.state.GameState;

public class GameStateTesting extends GameState {
	
	// =========================
	// FOR TESTING
	// =========================
	
	private int rectX = 0;
	private int rectY = 0;
	private int speedX = 4;
	private int speedY = 4;

	public GameStateTesting(GameCore game) {
		super(game);
		
	}

	@Override
	public void update() {
		
	}

	@Override
	public void render(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillRect(rectX, rectY, 32, 32);
	}
	
	@Override
	public void inputs() {
		
		if (Input.isKeyPressed(KeyEvent.VK_ESCAPE)) {
		    changeGameState(new GameStateMainMenu(game));
		}
		
		// TESTING --------- v 
		
		if (Input.isKeyDown(KeyEvent.VK_SPACE) && Input.isKeyDown(KeyEvent.VK_CONTROL)) {
		    System.out.println("Ctrl + space");
		}
		
		if (Input.isKeyPressed(KeyEvent.VK_SPACE)) {System.out.println("GAME: SPACE");}
		
		if (Input.isKeyDown(KeyEvent.VK_W)) {rectY -= speedY;}		
		if (Input.isKeyDown(KeyEvent.VK_S)) {rectY += speedY;}		
		if (Input.isKeyDown(KeyEvent.VK_A)) {rectX -= speedX;}		
		if (Input.isKeyDown(KeyEvent.VK_D)) {rectX += speedX;}
		
		if (Input.isMouseDown(MouseEvent.BUTTON1)) {rectX = Input.getMouseX(); rectY = Input.getMouseY();}
		
		// TESTING --------- ^
	}

}
