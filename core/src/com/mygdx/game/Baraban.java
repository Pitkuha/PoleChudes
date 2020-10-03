package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Baraban {

    private float centerX;
    private float centerY;
    private float radius;
    private float angle = 0;
    private double speed;

    public Baraban(float centerX, float centerY, float radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public void render (SpriteBatch batch) {
        batch.draw(Textures.getBaraban(),centerX - radius,centerY - radius,
                radius, radius, radius*2, radius*2,
                1,1,angle,0,0,
                512,512,false,false);
    }

    public void update(){
        if (speed > 0){
            speed--;
        }
        angle += speed / 60;
    }

    public void twist(float speed){
        this.speed = speed * (Math.random() + 0.5);
    }

    public boolean isPress(float x, float y){
        double r = Math.sqrt(Math.pow(x-centerY,2)+Math.pow(y-centerY,2));
        return r <= radius;
    }
}
