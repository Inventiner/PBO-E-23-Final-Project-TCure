package com.pbo.TCure;

import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class assetManager {
	private static BufferedImage wall, coin, player;
	public assetManager() {
		try {
			wall = ImageIO.read(getClass().getResource("/assets/Temp-Brain.png"));
			coin = ImageIO.read(getClass().getResource("/assets/Temp-Coin.png"));
			player = ImageIO.read(getClass().getResource("/assets/Temp-Player.png"));
		} catch (Exception e) {
			e.getMessage();
		}
		
		
			
	}
	public static BufferedImage getWall() {
		return wall;
	}
	public static BufferedImage getCoin() {
		return coin;
	}
	public static BufferedImage getPlayer() {
		return player;
	}	
}
