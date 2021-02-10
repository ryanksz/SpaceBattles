package com.SpaceBattles.entities;
/**
 * This contains the code
 * for the space ship the
 * player controls
 * ref: https://litiengine.com/docs/tutorials/creating-a-platformer/#a-noble-hero
 */

import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.CollisionInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.EntityInfo;
import de.gurkenlabs.litiengine.entities.MovementInfo;
import de.gurkenlabs.litiengine.input.KeyboardEntityController;
import de.gurkenlabs.litiengine.input.PlatformingMovementController;
import de.gurkenlabs.litiengine.physics.IMovementController;

import java.awt.event.KeyEvent;

//spaceship png 99x75

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 100)
@CollisionInfo(collisionBoxWidth = 18, collisionBoxHeight = 18, collision = true)
public class SpaceShip extends Creature implements IUpdateable {

    private static SpaceShip instance;

    //create a player instance
    public static SpaceShip instance() {
       if(instance == null) {
           instance = new SpaceShip();
       }
       return instance;
    }

    private SpaceShip() {
        super("playerShip1_blue.png");
        this.addController(new PlatformingMovementController<>(this));

        //controls
        KeyboardEntityController<SpaceShip> movement = new KeyboardEntityController<>(this);
        movement.addUpKey(KeyEvent.VK_W);
        movement.addDownKey(KeyEvent.VK_S);
        movement.addLeftKey(KeyEvent.VK_A);
        movement.addRightKey(KeyEvent.VK_D);

        //set the controls
        this.setController(IMovementController.class, movement);


    }




    @Override
    public void update() {

    }
}
