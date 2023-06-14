package com.in30minexample.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.in30minexample.learnspringframework.game.GameRunner;
import com.in30minexample.learnspringframework.game.GamingConsole;
import com.in30minexample.learnspringframework.game.PacManGame;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}
	
	
	
}
