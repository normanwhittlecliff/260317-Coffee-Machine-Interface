package com.normanwhittlecliff.coffeeLib.core;

import javax.swing.JFrame;

import com.normanwhittlecliff.cmi.game.Game;

public class GameWindow extends JFrame {
	private static final long serialVersionUID = 1L;
	//private Game game;
	// =================================================================================================================
	public GameWindow (GameCore gameCore) {
		//this.game = game;
		
		this.setTitle(gameCore.getGameConfig().getWindowTitle()) ;
		this.setResizable(gameCore.getGameConfig().isWindowRezisable());
		
		this.add(gameCore.getGamePanel());
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	// =================================================================================================================
}
