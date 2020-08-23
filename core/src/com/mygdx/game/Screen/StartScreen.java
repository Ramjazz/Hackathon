package com.mygdx.game.Screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Game;

public class StartScreen implements Screen {
    int widthOfApp;
    int lengthOfApp;
    public Game game;
    public StartScreen(Game game) {
        //widthOfApp = ;
        //lengthOfApp = ;
        this.game = game;
        game.create();
    }

    public void show() {
    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int widthOfApp, int lengthOfApp) {

    }

    public void pause() {
    }

    public void resume() {
    }

    public void hide() {
    }

    public void dispose() {
    }

}