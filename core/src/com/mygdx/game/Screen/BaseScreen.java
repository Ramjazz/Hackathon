package com.mygdx.game.Screen;

import	com.badlogic.gdx.Screen;
import	com.badlogic.gdx.InputProcessor;
import	com.badlogic.gdx.Game;
import	com.badlogic.gdx.Gdx;
import	com.badlogic.gdx.graphics.GL20;
import	com.badlogic.gdx.scenes.scene2d.Stage;
import	com.badlogic.gdx.utils.viewport.FitViewport;
import	com.badlogic.gdx.InputMultiplexer;

//This is a template for all screens

public abstract class BaseScreen implements Screen{

    protected Game game;
    protected Stage uiStage;
    public final int viewWidth = 640;
    public final int viewHeight = 480;

    public boolean paused;

    public	BaseScreen(Game	g) {
        game =	g;
        uiStage = new Stage(new FitViewport(viewWidth,viewHeight));
        paused = false;
        create();
    }

    public abstract void create();

    public abstract void update(float dt);



    public boolean isPaused(){
        return paused;
    }
    public void setPaused(boolean b)
    {
        paused = b;
    }
    public void togglePaused()
    {
        paused = !paused;
    }
    public void resize(int width, int height)
    {


    }
    public	void	pause()			{		}
    public	void	resume()		{		}
    public	void	dispose()	{		}
    public	void	show()				{		}
    public	void	hide()				{		}
}
