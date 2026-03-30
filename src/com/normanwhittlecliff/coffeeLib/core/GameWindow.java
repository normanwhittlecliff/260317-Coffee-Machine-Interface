package com.normanwhittlecliff.coffeeLib.core;

import javax.swing.JFrame;

import com.normanwhittlecliff.cmi.game.Game;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	//private Game game;
	// =================================================================================================================
	public GameWindow (Game game) {
		//this.game = game;
		
		this.setTitle(game.getGameConfig().getTitle() + " (v" + game.getGameConfig().getVersion() + ")") ;
		this.setResizable(game.getGameConfig().isWindowRezisable());
		
		this.add(game.getGamePanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	// =================================================================================================================
}
