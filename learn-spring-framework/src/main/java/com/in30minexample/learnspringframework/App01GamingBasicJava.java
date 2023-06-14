package com.in30minexample.learnspringframework;

import com.in30minexample.learnspringframework.game.GameRunner;
import com.in30minexample.learnspringframework.game.MarioGame;
import com.in30minexample.learnspringframework.game.PacManGame;
import com.in30minexample.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
     
	public static void main(String[] args) {
		
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		
		var game = new PacManGame(); //1: Object Creation
		
		var gameRunner = new GameRunner(game);
		//: Object Creation + Wiring of dependencies
		//: Game is a dependency of GameRunner
		gameRunner.run();
	}
}
