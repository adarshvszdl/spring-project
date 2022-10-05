package com.alag.loosecouplingtutorial.games;

import com.alag.loosecouplingtutorial.interfaces.GameController;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary    //declaring as primary component
public class Pacman implements GameController {
    @Override
    public void up() {
        System.out.println("Pacman up");
    }

    @Override
    public void down() {
        System.out.println("Pacman down");
    }
}
