package com.SpaceBattles;
/**
 * SpaceBattles!!
 * A 2d space shooter
 * By: Ryan Kaszubski
 * This game uses the LITIENGINE
 * https://litiengine.com/
 *
 */



import com.SpaceBattles.Screens.SpaceScreen;
import de.gurkenlabs.litiengine.Game;
import de.gurkenlabs.litiengine.resources.Resources;

public class Program {
    public static void main(String[] args) {
        //information about my game
        //title
        Game.info().setName("SpaceBattles!!");
        //description
        Game.info().setSubTitle("By Ryan Kaszubski");
        Game.info().setDescription("A simple space shooter");
        //current version
        Game.info().setVersion("0.1");

        //What we need to display the game window
        //https://litiengine.com/docs/getting-started/run-the-game/
        Game.init(args);

        //set render scale
        //https://litiengine.com/docs/tutorials/creating-a-platformer/
        Game.graphics().setBaseRenderScale(4.001f);

        //load data from the utilili
        //https://litiengine.com/docs/tutorials/creating-a-platformer/
        Resources.load("game.litidata");

        //add the screen
        Game.screens().add(new SpaceScreen());

        //load the game
        Game.world().loadEnvironment("spacebattlesmap");
        Game.start();



    }
}
