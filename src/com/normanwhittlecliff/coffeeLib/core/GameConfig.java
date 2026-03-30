package com.normanwhittlecliff.coffeeLib.core;

public class GameConfig {
	// =================================================================================================================
	private String title;
	// =================================================================================================================
	private Version version;
	// =================================================================================================================
	private boolean windowRezisable = false;
	private float scale;
	private int baseWidth;  // 640;
	private int baseHeight;  // 360;
	private int width;
	private int height;
	
	private int targetFPS = 60;
	private int targetUPS = 60;
	
	public void calculateSize() {
		this.width  = (int) (baseWidth * scale);
		this.height = (int) (baseHeight * scale);
		
		System.out.println("> GameConfig: Width = " + width);
		System.out.println("> GameConfig: Height = " + height);
	}
	// =================================================================================================================
	// GETTERS & SETTERS
	public String getTitle() {return title;}
	public void setTitle(String title) {this.title = title;}
	
	public int getTargetFPS() {return targetFPS;	}
	public void setTargetFPS(int targetFPS) {this.targetFPS = targetFPS;}
	
	public int getTargetUPS() {return targetUPS;	}
	public void setTargetUPS(int targetUPS) {this.targetUPS = targetUPS;}
	
	public Version getVersion() {return version;}
	public void setVersion(Version version) {this.version = version;}
	
	public boolean isWindowRezisable() {return windowRezisable;}
	public void setWindowRezisable(boolean windowRezisable) {this.windowRezisable = windowRezisable;}
	
	public float getScale() {return scale;}
	public void setScale(float gameScale) {this.scale = gameScale;}
	
	public int getBaseWidth() {return baseWidth;}
	public void setBaseWidth(int baseWidth) {this.baseWidth = baseWidth;}
	
	public int getBaseHeight() {return baseHeight;}
	public void setBaseHeight(int baseHeight) {this.baseHeight = baseHeight;}
	
	public int getWidth() {return width;}
	public void setWidth(int width) {this.width = width;}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	// =================================================================================================================
}
