package com.alag.loosecouplingtutorial;

import com.alag.loosecouplingtutorial.gamerunner.GameRunner;
import com.alag.loosecouplingtutorial.games.Mario;
import com.alag.loosecouplingtutorial.games.Snake;
import com.alag.loosecouplingtutorial.interfaces.GameController;
import org.apache.naming.ContextAccessController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan({"com.alag.loosecouplingtutorial","",""})
public class LooseCouplingTutorialApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(LooseCouplingTutorialApplication.class, args);

		GameRunner runner = context.getBean(GameRunner.class);

//		GameController game1 = new Mario();
//		GameController game2 = new Snake();
//		GameRunner runner1 = new GameRunner(game1);
//		GameRunner runner2 = new GameRunner(game2);

		runner.run();

	}

}
