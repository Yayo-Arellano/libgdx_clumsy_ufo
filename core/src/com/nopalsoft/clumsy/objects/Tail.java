package com.nopalsoft.clumsy.objects;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.Pool.Poolable;

public class Tail implements Poolable {
	public static float VELOCIDADX = -5f;
	public final Vector2 position;

	public Tail() {
		position = new Vector2();
	}

	public void update(float delta) {
		position.x += VELOCIDADX * delta;

	}

	public void init(float x, float y) {
		position.set(x, y);
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub

	}
}
