package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class AppPole extends ApplicationAdapter {
	SpriteBatch batch;
	Baraban baraban;

	@Override
	public void create () {
		batch = new SpriteBatch();
		baraban = new Baraban();
	}

	@Override
	public void render () {
		update();
		Gdx.gl.glClearColor(0.2f, 0, 0.5f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		baraban.render(batch);
		batch.end();
	}

	public void update(){
		baraban.update();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
	}
}
