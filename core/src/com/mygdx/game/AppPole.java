package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class AppPole extends ApplicationAdapter {
	SpriteBatch batch;
	Baraban baraban;
	Vector2 coord;
	Viewport viewport;
	LetterBoard letterBoard;

	@Override
	public void create () {
		viewport = new FitViewport(1200,800);
		batch = new SpriteBatch();
		baraban = new Baraban(256, 256,256);
		baraban.twist(300);
		coord = new Vector2();
		letterBoard = new LetterBoard(600,10,8);
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0.2f, 0, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		baraban.render(batch);
		letterBoard.render(batch);
		batch.end();
	}



	public void update(){
		baraban.update();
		if (Gdx.input.justTouched()){
			System.out.println(getCoord().x + " " + getCoord().y);
			if (baraban.isPress(getCoord().x, getCoord().y)){
				baraban.twist(240);
			}
		}
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}

	@Override
	public void resize(int width, int height){
		getViewport().update(width,height,true);
		getViewport().apply();
	}

	public Vector2 getCoord() {
		return getViewport().unproject(coord.set(Gdx.input.getX(),Gdx.input.getY()));
	}

	public Viewport getViewport() {
		return viewport;
	}
}
