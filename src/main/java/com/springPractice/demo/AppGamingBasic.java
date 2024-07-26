package com.springPractice.demo;

import com.springPractice.demo.game.GameRunner;
import com.springPractice.demo.game.MarioGame;
import com.springPractice.demo.game.SuperContraGame;

public class AppGamingBasic {

	public static void main(String[] args) {
		//var game = new MarioGame();
		var game = new SuperContraGame(); //1) object creation

		var gameRunner = new GameRunner(game); // 2) object creation+ wiring of dependency
		// game is a dependency of GameRunner
		gameRunner.run();

	}

}
