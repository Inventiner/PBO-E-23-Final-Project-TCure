package com.pbo.TCure;

import java.awt.Graphics;
import java.awt.event.KeyEvent;

abstract public class Level {
	Player player = new Player();
	private int[][] level;
	private int width, height, unitSize;
	boolean win = false;
	
	public Level() {		
	}
	
	public Level(int[][] level, int width, int height, int unitSize) {
		this.level = level;
		this.width = width;
		this.height = height;;
		this.unitSize = unitSize;
	}
	
	public int[][] getLevel() {
		return level;
	}

	public Player getPlayer() {
		return player;
	}

	public void setLevel(int[][] level) {
		this.level = level;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getUnitSize() {
		return unitSize;
	}

	public void setUnitSize(int unitSize) {
		this.unitSize = unitSize;
	}
	
	public boolean getWin() {
		if(win) return true;
		else return false;
	}

	abstract public void draw(Graphics g);
	
	abstract public void keyHandler(KeyEvent e);
	
	abstract void drawPlayer(Graphics g);
}
