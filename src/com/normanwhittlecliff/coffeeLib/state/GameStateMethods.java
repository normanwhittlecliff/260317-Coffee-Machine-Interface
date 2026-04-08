package com.normanwhittlecliff.coffeeLib.state;

import java.awt.Graphics;

public interface GameStateMethods {
	
	public void init();
	
	public void update();
	
	public void render(Graphics g);
	
	public void inputs();
	
}
