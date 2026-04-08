package com.normanwhittlecliff.cmi.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

import com.normanwhittlecliff.coffeeLib.core.GameConfig;
import com.normanwhittlecliff.coffeeLib.core.GameCore;
import com.normanwhittlecliff.coffeeLib.core.GameLoop;
import com.normanwhittlecliff.coffeeLib.core.GameMethods;
import com.normanwhittlecliff.coffeeLib.core.GamePanel;
import com.normanwhittlecliff.coffeeLib.core.GameWindow;
import com.normanwhittlecliff.coffeeLib.core.Version;
import com.normanwhittlecliff.coffeeLib.input.Input;
import com.normanwhittlecliff.coffeeLib.util.Debug;

public class Game extends GameCore implements GameMethods{
	
	// =========================
	// CONSTRUCTURS
	// =========================
	
	public Game() {
		Debug.printInit("Game");
		initialize();
	}

	@Override
	public void update() {
		this.getGameStateManager().update();
		this.getInput().update();
	}
	
	@Override
	public void render(Graphics g) {
		this.getGameStateManager().render(g);
	}
	
	@Override
	protected void initGameConfig() {
		this.setGameConfig(new GameConfig());
		
		this.getGameConfig().setBaseWidth(640);
		this.getGameConfig().setBaseHeight(360);
		this.getGameConfig().setTargetUPS(60);
		this.getGameConfig().setTargetUPS(60);
		this.getGameConfig().setScale(1.5f);
		this.getGameConfig().calculateSize();
		
		this.getGameConfig().setTitle("Coffee-Machine Interface");
		this.getGameConfig().setVersion(new Version(0, 1, 0, "Pre-Alpha"));
	}
}
