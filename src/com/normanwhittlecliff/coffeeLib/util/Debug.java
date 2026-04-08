package com.normanwhittlecliff.coffeeLib.util;

public class Debug {
	
	public static boolean debugMode = true;
	
	public static void println(String text) {
		if (debugMode) {System.out.println("DEBUG: " + text);}
	}
	
	public static void printInit(Object obj) {
		if (debugMode) {System.out.println("DEBUG: " + obj.toString() + " > INITIALIZING...");}
	}
}
