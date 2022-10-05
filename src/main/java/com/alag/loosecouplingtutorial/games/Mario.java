package com.alag.loosecouplingtutorial.games;

import com.alag.loosecouplingtutorial.interfaces.GameController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mario implements GameController {

    @Override
    public void up() {
        System.out.println("Mario up");
    }

    @Override
    public void down() {
        System.out.println("Mario down");
    }
}
