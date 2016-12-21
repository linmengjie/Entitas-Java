package com.ilargia.games.entitas.utils;

import com.ilargia.games.entitas.components.Interactive;
import com.ilargia.games.entitas.components.Score;
import com.ilargia.games.entitas.components.Position;
import com.ilargia.games.entitas.components.Player;
import com.ilargia.games.entitas.components.View;
import com.ilargia.games.entitas.components.Motion;

/**
 * ---------------------------------------------------------------------------
 * '<auto-generated>' This code was generated by CodeGeneratorApp.
 * ---------------------------------------------------------------------------
 */
public class TestComponentIds {

	public static final int Interactive = 0;
	public static final int Score = 1;
	public static final int Position = 2;
	public static final int Player = 3;
	public static final int View = 4;
	public static final int Motion = 5;
	public static final int totalComponents = 6;

	public static String[] componentNames() {
		return new String[]{"Interactive", "Score", "Position", "Player",
				"View", "Motion"};
	}

	public static Class[] componentTypes() {
		return new Class[]{Interactive.class, Score.class, Position.class,
				Player.class, View.class, Motion.class};
	}
}