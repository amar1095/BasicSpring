package com.springPractice.demo.game;

public class GameRunner {
	//MarioGame game;
	GamingConsole game;

	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println(" run the game");
		game.down();
		game.left();
		game.right();
		game.up();
	}

}
