package com.paulovelado.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.paulovelado.game.FlappyDemo;

import static com.paulovelado.game.FlappyDemo.HEIGHT;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		config.width = FlappyDemo.WIDTH;
		config.height = HEIGHT;
		config.title = FlappyDemo.TITLE;
		new LwjglApplication(new FlappyDemo(), config);


	}
}
