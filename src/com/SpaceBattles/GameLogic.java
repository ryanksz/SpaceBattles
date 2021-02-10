package com.SpaceBattles;

import com.SpaceBattles.entities.Enemy;
import com.SpaceBattles.entities.SpaceShip;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.entities.Spawnpoint;
import de.gurkenlabs.litiengine.graphics.Camera;
import de.gurkenlabs.litiengine.graphics.PositionLockCamera;

/**
 * This is used for the game logic
 * Camera, gravity, spawn, etc...
 * docs reference: https://litiengine.com/docs/tutorials/creating-a-platformer/#where-to-put-my-game-logic
 */

public final class GameLogic {
    private GameLogic() {

    }

    public static void init() {
        //lock the camera to the player
        Camera camera = new PositionLockCamera(SpaceShip.instance());
        camera.setClampToMap(true);
        Game.world().setCamera(camera);

        //add the spawn points
        Game.world().onLoaded(e -> {
            Spawnpoint spawn = e.getSpawnpoint("spawn");
            if(spawn != null) {
                spawn.spawn(SpaceShip.instance());
            }else {
                System.out.println("Cannot find spawn point");
            }
            Spawnpoint enemySpawn = e.getSpawnpoint("enemySpawn");
            if(enemySpawn != null) {
                enemySpawn.spawn(Enemy.instance());
            }else {
                System.out.println("Cannot find enemy spawn point");
            }
        });
    }


}
