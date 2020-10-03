package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Baraban {

    float angle = 0;
    public void render (SpriteBatch batch) {
        batch.draw(Textures.getBaraban(),0,0, 256, 256, 512, 512,
                1,1,angle,0,0,
                512,512,false,false);
    }

    public void update(){
        angle++;
    }
}
