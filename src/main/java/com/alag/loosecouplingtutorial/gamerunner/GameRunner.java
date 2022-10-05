package com.alag.loosecouplingtutorial.gamerunner;

import com.alag.loosecouplingtutorial.games.Mario;
import com.alag.loosecouplingtutorial.interfaces.GameController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    //    *****construction injection*****
//    Always recommended
    @Autowired
    GameController game;

    public GameRunner(GameController game) {
        this.game = game;
    }

//    ***************************************

//    *****Setter injection*****
//    GameController game;
//    @Autowired
//    public void setGame(GameController game) {
//        this.game = game;
//    }

//    ***************************************

    //    *****Field injection*****
//    @Autowired
    //    GameController game;
    public void run() {
        game.up();
        game.down();
    }
}
