package com.mygdx.game;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class LetterBoard {
    private float x;
    private float y;
    private int h;

    public LetterBoard(float x, float y, int h) {
        this.x = x;
        this.y = y;
        this.h = h;
    }

    public void render (SpriteBatch batch) {
        batch.draw(Textures.getFont32(),x,y);
    }
}
