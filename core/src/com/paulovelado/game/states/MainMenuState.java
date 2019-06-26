package com.paulovelado.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.paulovelado.game.FlappyDemo;

public class MainMenuState extends State {
    private Texture background;
    private Texture playBtn;

    public MainMenuState(GameStateManager gsm){
        super(gsm);
        background = new Texture("bg.png");
        playBtn = new Texture("playBtn.png");
    }
    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void render(SpriteBatch sb) {

        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(playBtn, FlappyDemo.WIDTH / 2 - (playBtn.getWidth() / 2), FlappyDemo.HEIGHT /2);
        sb.end();

    }

    @Override
    public void dispose() {
        background.dispose();
        playBtn.dispose();
        System.out.println("Menu State Disposed");
    }
}
