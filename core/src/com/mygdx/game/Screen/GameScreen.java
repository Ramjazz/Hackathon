package com.mygdx.game.Screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class GameScreen implements Screen {

    private static final int WIDTHOFAPP = 640;
    private static final int LENGTHOFAPP = 480;

    public Game game;
    public Stage stage;

    public GameScreen(Game game) {

        this.game = game;
        game.create();
        stage = new Stage(new FitViewport(WIDTHOFAPP,LENGTHOFAPP));

    }

    public void show() {}

    public void create(){

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.4f,0.4f,0.7f,0);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        stage.act();
        stage.draw();

    }

    @Override
    public void resize(int widthOfApp, int lengthOfApp) {}

    public void pause() {}

    public void resume() {}

    public void hide() {}

    @Override
    public void dispose() {}

}