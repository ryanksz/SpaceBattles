package com.SpaceBattles.entities;


import de.gurkenlabs.litiengine.IUpdateable;
import de.gurkenlabs.litiengine.entities.CollisionInfo;
import de.gurkenlabs.litiengine.entities.Creature;
import de.gurkenlabs.litiengine.entities.EntityInfo;
import de.gurkenlabs.litiengine.entities.MovementInfo;

//This is for the enemies that spawn throughout the map
//currently a test enemy
//ref: see SpaceShip class

@EntityInfo(width = 18, height = 18)
@MovementInfo(velocity = 100)
@CollisionInfo(collisionBoxWidth = 18, collisionBoxHeight = 18, collision = true)
public class Enemy extends Creature implements IUpdateable {

    private static Enemy instance;

    //create the enemies instant
    public static Enemy instance() {
        if(instance == null){
          instance = new Enemy();
        }
        return instance;
    }

    private Enemy() {
        //display the enemies sprite
        super("enemyBlack1.png");
    }

    @Override
    public void update() {

    }
}
