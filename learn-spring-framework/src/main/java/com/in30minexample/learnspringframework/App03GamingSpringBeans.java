package com.in30minexample.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in30minexample.learnspringframework.game.GameRunner;
import com.in30minexample.learnspringframework.game.GamingConsole;
import com.in30minexample.learnspringframework.game.MarioGame;
import com.in30minexample.learnspringframework.game.PacManGame;
import com.in30minexample.learnspringframework.game.SuperContraGame;

public class App03GamingSpringBeans {
     
	public static void main(String[] args) {
		
		try(var context = 
				new AnnotationConfigApplicationContext
				    (GamingConfiguration.class)) {
					
					context.getBean(GamingConsole.class).up();
					
					context.getBean(GameRunner.class).run();
				}
		
	}
}
