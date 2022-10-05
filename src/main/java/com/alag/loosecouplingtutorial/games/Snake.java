package com.alag.loosecouplingtutorial.games;

import com.alag.loosecouplingtutorial.interfaces.GameController;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Snake implements GameController {
    @Override
    public void up() {
        System.out.println("Snake up");
    }

    @Override
    public void down() {
        System.out.println("Snake down");
    }
}
