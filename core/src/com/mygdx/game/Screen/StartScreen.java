package com.mygdx.game.Screen;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class StartScreen implements Screen {

    int widthOfApp = 640;
    int lengthOfApp = 480;

    public Game game;
    public Stage uiStage;

    public StartScreen(Game game) {
        this.game = game;
        game.create();
        uiStage = new Stage(new FitViewport(widthOfApp,lengthOfApp));

    }

    public void show() {}

    @Override
    public void render(float delta) {}

    @Override
    public void resize(int widthOfApp, int lengthOfApp) {}

    public void pause() {}

    public void resume() {}

    public void hide() {}

    @Override
    public void dispose() {}

}