package com.normanwhittlecliff.coffeeLib.core;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.normanwhittlecliff.cmi.game.Game;
import com.normanwhittlecliff.coffeeLib.input.Input;

public class GamePanel extends JPanel{
	
	private Game game;
	private Input input;
	
	private int frames;
	
	public GamePanel(Game game) {
		this.game = game;
		this.setPreferredSize(new Dimension(game.getGameConfig().getWidth(), game.getGameConfig().getHeight()));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		game.render(g);
	}
	
}
