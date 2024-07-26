package com.springPractice.demo;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springPractice.demo.game.GameRunner;
import com.springPractice.demo.game.GamingConfiguration;
import com.springPractice.demo.game.GamingConsole;
import com.springPractice.demo.game.MarioGame;
import com.springPractice.demo.game.SuperContraGame;

public class App03GamingSpringBean {

	public static void main(String[] args) {
//		//var game = new MarioGame();
//		var game = new SuperContraGame(); //1) object creation
//
//		var gameRunner = new GameRunner(game); // 2) object creation+ wiring of dependency
//		// game is a dependency of GameRunner
//		gameRunner.run();
		
		// create Spring context
		
		try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
