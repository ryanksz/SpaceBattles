package com.SpaceBattles;

import de.gurkenlabs.litiengine.entities.IMobileEntity;
import de.gurkenlabs.litiengine.input.Input;

import java.awt.event.KeyEvent;

//this class is for the input
//ref: https://litiengine.com/docs/tutorials/creating-a-platformer/#organizing-player-input
public final class PlayerInput {
    private PlayerInput() {

    }

    //this is where I can gather input
    //good to know: the Input class supports gamepads
    public static void init() {
        //press esc to exit
        Input.keyboard().onKeyPressed(KeyEvent.VK_ESCAPE, e -> System.exit(0));
    }
}
