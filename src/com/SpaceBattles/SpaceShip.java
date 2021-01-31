package com.SpaceBattles;
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
import de.gurkenlabs.litiengine.input.PlatformingMovementController;
import javazoom.jl.player.Player;

//spaceship png 99x75

@EntityInfo(width = 99, height = 75)
@MovementInfo(velocity = 100)
@CollisionInfo(collisionBoxWidth = 90, collisionBoxHeight = 70, collision = true)
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
        super("playerShip1_blue");
        this.addController(new PlatformingMovementController<>(this));

    }


    @Override
    public void update() {

    }
}
