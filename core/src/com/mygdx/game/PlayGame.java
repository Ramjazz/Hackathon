package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.mygdx.game.Screen.StartScreen;

public class PlayGame extends Game {
    public static StartScreen newLevel;


    public void create() {
        newLevel = new StartScreen(this);
        this.setScreen(newLevel);
    }
}
