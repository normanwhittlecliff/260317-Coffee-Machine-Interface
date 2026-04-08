package com.normanwhittlecliff.coffeeLib.input;

import java.awt.event.*;
import java.util.HashSet;
import java.util.Set;

import com.normanwhittlecliff.coffeeLib.util.Debug;

public class Input implements KeyListener, MouseListener, MouseMotionListener {

    private static final Set<Integer> keysDown = new HashSet<>();
    private static final Set<Integer> keysPressed = new HashSet<>();
    private static final Set<Integer> keysReleased = new HashSet<>();

    private static final Set<Integer> mouseDown = new HashSet<>();
    private static final Set<Integer> mousePressed = new HashSet<>();
    private static final Set<Integer> mouseReleased = new HashSet<>();

    private static int mouseX;
    private static int mouseY;

    public Input() {
    	Debug.println("Input > INITIALIZING...");
    }
    
    // =========================
    // Keyboard Events
    // =========================

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (!keysDown.contains(key)) {
            keysPressed.add(key); // first frame press
        }

        keysDown.add(key);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        keysDown.remove(key);
        keysReleased.add(key);
    }

    @Override
    public void keyTyped(KeyEvent e) {}

    // =========================
    // Mouse Events
    // =========================

    @Override
    public void mousePressed(MouseEvent e) {
        int btn = e.getButton();

        if (!mouseDown.contains(btn)) {
            mousePressed.add(btn);
        }

        mouseDown.add(btn);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int btn = e.getButton();

        mouseDown.remove(btn);
        mouseReleased.add(btn);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        mouseX = e.getX();
        mouseY = e.getY();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        mouseMoved(e);
    }

    @Override public void mouseClicked(MouseEvent e) {}
    @Override public void mouseEntered(MouseEvent e) {}
    @Override public void mouseExited(MouseEvent e) {}

    // =========================
    // Query Methods (IMPORTANT)
    // =========================
    
    /**
     * A method to detect if a key was pressed
     * @return true if any key is pressed. False, otherwise.
     */
    public static boolean isKeyPressed() {
        return (!keysPressed.isEmpty());
    }
    
    public static boolean isKeyDown(int keyCode) {
        return keysDown.contains(keyCode);
    }

    public static boolean isKeyPressed(int keyCode) {
        return keysPressed.contains(keyCode);
    }

    public static boolean isKeyReleased(int keyCode) {
        return keysReleased.contains(keyCode);
    }

    public static boolean isMouseDown(int button) {
        return mouseDown.contains(button);
    }

    public static boolean isMousePressed(int button) {
        return mousePressed.contains(button);
    }

    public static boolean isMouseReleased(int button) {
        return mouseReleased.contains(button);
    }

    public static int getMouseX() { return mouseX; }
    public static int getMouseY() { return mouseY; }

    // =========================
    // MUST CALL EVERY FRAME
    // =========================

    public static void update() {
        keysPressed.clear();
        keysReleased.clear();

        mousePressed.clear();
        mouseReleased.clear();
    }
}
